// Get references to the form and the list where bookings will be displayed
const bookingForm = document.getElementById('bookingForm');
const serviceList = document.getElementById('serviceList');

// Initialize an array to hold bookings
let bookings = []; // This array will store all the bookings made by the user

// Add an event listener to the booking form to handle the submission
bookingForm.addEventListener('submit', async function(e) {
    e.preventDefault(); // Prevent the default form submission behavior, which would refresh the page

    // Create a new booking object from the form inputs
    const newBooking = {
        service_type: document.getElementById('serviceType').value, // Get the service type from the input
        service_date: document.getElementById('date').value, // Get the service date from the input
        service_time: document.getElementById('time').value, // Get the service time from the input
    };

    // Send the new booking object to the backend server using a POST request
    const response = await fetch('http://localhost:3000/api/orders', {
        method: 'POST', // Specify the request method as POST
        headers: {
            'Content-Type': 'application/json', // Set the content type to JSON
        },
        body: JSON.stringify(newBooking), // Convert the new booking object to a JSON string
    });

    // Check if the response from the server is OK (status in the range 200-299)
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

// Function to display the bookings in the serviceList element
function displayBookings() {
    serviceList.innerHTML = ''; // Clear the current list of bookings displayed

    // Iterate over each booking in the bookings array
    bookings.forEach((booking, index) => {
        // Create a new list item for each booking
        const listItem = document.createElement('li');
        listItem.className = 'list-group-item d-flex justify-content-between align-items-center'; // Set class for styling
        // Set the inner HTML of the list item to show booking details and action buttons
        listItem.innerHTML = `${booking.service_type} - ${booking.service_date} at ${booking.service_time}
            <button class="btn btn-danger btn-sm" onclick="deleteBooking(${booking.order_id})">Delete</button>
            <button class="btn btn-warning btn-sm" onclick="editBooking(${index})">Edit</button>`;
        serviceList.appendChild(listItem); // Append the list item to the service list
    });
}

// Function to delete a booking based on its order_id
async function deleteBooking(order_id) {
    // Send a DELETE request to the backend to remove the booking
    await fetch(`http://localhost:3000/api/orders/${order_id}`, {
        method: 'DELETE', // Specify the request method as DELETE
    });
    // Filter out the deleted booking from the local bookings array
    bookings = bookings.filter(booking => booking.order_id !== order_id); // Update the local array
    displayBookings(); // Call the function to update the displayed bookings list
}

// Function to edit a booking based on its index in the bookings array
function editBooking(index) {
    const booking = bookings[index]; // Get the booking to be edited using its index
    // Populate the form fields with the existing booking details
    document.getElementById('serviceType').value = booking.service_type; // Set service type input
    document.getElementById('date').value = booking.service_date; // Set service date input
    document.getElementById('time').value = booking.service_time; // Set service time input

    deleteBooking(booking.order_id); // Remove the booking from the list to prevent duplicates when re-submitting
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