
// form and list ka ref get karne ke liye

const bookingForm = document.getElementById('bookingForm');
const serviceList = document.getElementById('serviceList');

// init array to store booking
let bookings = []; 

//jab form submit hoga,it runs a func to create a new bk obj,then send to backend and update the array
bookingForm.addEventListener('submit', async function(e) {
    e.preventDefault(); //prev reload
    

    // new bking obj from form i/p
    const newBooking = {
        service_type: document.getElementById('serviceType').value, 
        service_date: document.getElementById('date').value, 
        service_time: document.getElementById('time').value, 
    };

   
    //bking obj => backend server using POST
    const response = await fetch('http://localhost:3000/api/orders', {
        method: 'POST', 
        headers: {
            'Content-Type': 'application/json', //content type => JSON
        },
        body: JSON.stringify(newBooking), // cnvrt bking obj => json string
    });

    
    //To check if res is OK
    if (response.ok) {
        const result = await response.json(); // Parse the response JSON to get the result
        bookings.push(result); // Add the new booking to the local array of bookings
        displayBookings(); // Call the function to update the displayed bookings list
        alert('Booking successful!'); // Notify the user that the booking was successful
        bookingForm.reset(); // Reset the form fields to their initial state
    } else {
        alert('Error: Unable to book service.'); // Notify the user of an error if the booking fails
    }
});


function displayBookings() {
    serviceList.innerHTML = ''; // current list cleared

    // to travel the array of bking obj(to reduce redundancy)
    bookings.forEach((booking, index) => {
      const listItem = document.createElement('li');   //  create list item(li) for each bking obj
        listItem.className = 'list-group-item d-flex justify-content-between align-items-center'; 
        
        listItem.innerHTML = `${booking.service_type} - ${booking.service_date} at ${booking.service_time} 
            <button class="btn btn-danger btn-sm" onclick="deleteBooking(${booking.order_id})">Delete</button> 
            <button class="btn btn-warning btn-sm" onclick="editBooking(${index})">Edit</button>`;
        //^^dlt btn => delete fnc with order id 
        //^^edt btn=> edit fnc with bking index
            serviceList.appendChild(listItem); // add li to service list
    });
}


async function deleteBooking(order_id) {  //let fnc complete before moving to next line
    // DEl req
    await fetch(`http://localhost:3000/api/orders/${order_id}`, {
        method: 'DELETE'
    });
   
    bookings = bookings.filter(booking => booking.order_id !== order_id); // updation of arr
    displayBookings(); 
}


function editBooking(index) {
    const booking = bookings[index]; // using index get the booking to be edited
    // IMP:Populate form fields with existing vals
     document.getElementById('serviceType').value = booking.service_type; 
     document.getElementById('date').value = booking.service_date;
     document.getElementById('time').value = booking.service_time;

    deleteBooking(booking.order_id); // to prevent redundancy,del booking from list
     
}












// const bookingForm = document.getElementById('bookingForm');
// const serviceList = document.getElementById('serviceList');
// let bookings = []; // Array to hold bookings

// bookingForm.addEventListener('submit', async function(e) {
//     e.preventDefault(); // Prevent the default form submission

//     // Create a new booking object
//     const newBooking = {
//         service_type: document.getElementById('serviceType').value,
//         service_date: document.getElementById('date').value,
//         service_time: document.getElementById('time').value,
//     };

//     // Send the new booking to the backend
//     const response = await fetch('http://localhost:3000/api/orders', {
//         method: 'POST',
//         headers: {
//             'Content-Type': 'application/json',
//         },
//         body: JSON.stringify(newBooking),
//     });

//     if (response.ok) {
//         const result = await response.json();
//         bookings.push(result); // Add the new booking to the local array
//         displayBookings(); // Update the displayed bookings
//         alert('Booking successful!'); // Notify user of success
//         bookingForm.reset(); // Reset the form
//     } else {
//         alert('Error: Unable to book service.'); // Notify user of error
//     }
// });

// function displayBookings() {
//     serviceList.innerHTML = ''; // Clear the current list
//     bookings.forEach((booking, index) => {
//         const listItem = document.createElement('li');
//         listItem.className = 'list-group-item d-flex justify-content-between align-items-center';
//         listItem.innerHTML = `${booking.service_type } - ${booking.service_date} at ${booking.service_time}
//             <button class="btn btn-danger btn-sm" onclick="deleteBooking(${booking.order_id})">Delete</button>
//             <button class="btn btn-warning btn-sm" onclick="editBooking(${index})">Edit</button>`;
//         serviceList.appendChild(listItem);
//     });
// }

// async function deleteBooking(order_id) {
//     await fetch(`http://localhost:3000/api/orders/${order_id}`, {
//         method: 'DELETE',
//     });
//     bookings = bookings.filter(booking => booking.order_id !== order_id); // Remove the booking from the local array
//     displayBookings(); // Update the displayed bookings
// }

// function editBooking(index) {
//     const booking = bookings[index];
//     document.getElementById('serviceType').value = booking.service_type;
//     document.getElementById('date').value = booking.service_date;
//     document.getElementById('time').value = booking.service_time;

//     deleteBooking(booking.order_id); // Remove the booking to prevent duplicates
// }