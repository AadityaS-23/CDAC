const bookingForm = document.getElementById('bookingForm'); // id se booking form select 
const serviceList = document.getElementById('serviceList'); // element select karta hai jaha bookings display  hoga 
let bookings = []; //arr


bookingForm.addEventListener('submit', function(e) {
  e.preventDefault(); // prevent reload

  //booking obj
  const newBooking = {
    serviceType: document.getElementById('serviceType').value, //values from form
    date: document.getElementById('date').value, 
    time: document.getElementById('time').value, 
  };

  bookings.push(newBooking); // booking object add hota hai arr mai
  displayBookings(); // display booking

  localStorage.setItem('lastBooking', JSON.stringify(newBooking)); // last booking saved

  window.open('confirm_booking.html', '_blank'); 
});


function displayBookings() {
  serviceList.innerHTML = ''; // clear curr list
  bookings.forEach((booking, index) => { 
    const listItem = document.createElement('li'); // new list item element for each booking
    listItem.className = 'list-group-item d-flex justify-content-between align-items-center'; // BS
    listItem.innerHTML = `${booking.serviceType} - ${booking.date} at ${booking.time}
      <button class="btn btn-danger btn-sm" onclick="deleteBooking(${index})">Delete</button>
      <button class="btn btn-warning btn-sm" onclick="editBooking(${index})">Edit</button>`; 
    serviceList.appendChild(listItem); // list item add hota hai servce list mai
  });
}


function deleteBooking(index) {
  bookings.splice(index, 1); // rm bookng at an index
  displayBookings(); // updated list
}


function editBooking(index) {
  const booking = bookings[index]; // fetch booking to edit using index
  document.getElementById('serviceType').value = booking.serviceType; 
  document.getElementById('date').value = booking.date; 
  document.getElementById('time').value = booking.time; 

  deleteBooking(index); //used this to prevent duplicates
}
