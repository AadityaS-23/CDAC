const bookingForm = document.getElementById('bookingForm'); 
// Selects the HTML form with ID 'bookingForm' to access its fields and manage submission events.

const serviceList = document.getElementById('serviceList'); 
// Selects the HTML element with ID 'serviceList' where the booking list will be displayed.

let bookings = []; 
// Initializes an empty array to store all bookings entered by the user.

let editingIndex = null; 
// Tracks the index of the booking being edited; null means no booking is being edited.

bookingForm.addEventListener('submit', function(e) { 
    // Adds an event listener for when the form is submitted.
  
    e.preventDefault(); 
    // Prevents the default behavior (page reload) on form submission.

    const newBooking = {
        serviceType: document.getElementById('serviceType').value, 
        // Gets the value from the 'serviceType' input field in the form.
        
        date: document.getElementById('date').value, 
        // Gets the value from the 'date' input field in the form.
        
        time: document.getElementById('time').value, 
        // Gets the value from the 'time' input field in the form.
      };
    

      if (editingIndex !== null) { 
        // Checks if editingIndex is not null, meaning we are in edit mode.
        
        bookings[editingIndex] = newBooking; 
        // Updates the existing booking at editingIndex with the new data entered in the form.
    
        editingIndex = null; 
        // Resets editingIndex to null, exiting edit mode after saving the changes.
      } else { 
        // If editingIndex is null, we're not in edit mode, so this is a new booking.
        
        bookings.push(newBooking); 
        // Adds the new booking object to the bookings array.
        
        localStorage.setItem('lastBooking', JSON.stringify(newBooking)); 
        // Saves the new booking to localStorage, so it's retained even if the page is refreshed.
        
        window.open('confirm_booking.html', '_blank'); 
        // Opens a new tab or window displaying the booking confirmation page.
      }
    
      displayBookings(); 
      // Calls displayBookings() to update the displayed list with the current bookings array.
    
      bookingForm.reset(); 
      // Clears the form fields, preparing for a new entry.
    });
    

    function displayBookings() { 
        serviceList.innerHTML = ''; 
        // Clears the serviceList element so it doesn't duplicate items each time it's called.
      
        bookings.forEach((booking, index) => { 
            // Loops through each booking in the bookings array, with 'index' tracking the position.
            
            const listItem = document.createElement('li'); 
            // Creates a new list item (li) element to display booking details and action buttons.
        
            listItem.className = 'list-group-item d-flex justify-content-between align-items-center'; 
            // Adds Bootstrap classes for layout, spacing, and alignment of the list item.
        
            listItem.innerHTML = `${booking.serviceType} - ${booking.date} at ${booking.time}
            <button class="btn btn-danger btn-sm" onclick="deleteBooking(${index})">Delete</button>
            <button class="btn btn-warning btn-sm" onclick="editBooking(${index})">Edit</button>`; 
          // Sets the list item content to display booking details and action buttons:
          // 'Delete' button calls deleteBooking(index), removing the booking at this index.
          // 'Edit' button calls editBooking(index), allowing the user to modify this booking.
          
          serviceList.appendChild(listItem); 
          // Adds the list item to the serviceList element, displaying it on the page.
        });
      }
      
      function deleteBooking(index) { 
        bookings.splice(index, 1); 
        // Removes the booking at the specified index from the bookings array.
      
        displayBookings(); 
        // Refreshes the displayed list of bookings after deletion.
      }

      
      function editBooking(index) { 
        const booking = bookings[index]; 
        // Gets the booking at the specified index from the bookings array.

        

        document.getElementById('serviceType').value = booking.serviceType; 
        // Fills the 'serviceType' input field with the current value of the booking being edited.
        
        document.getElementById('date').value = booking.date; 
        // Fills the 'date' input field with the current date of the booking being edited.
        
        document.getElementById('time').value = booking.time; 
        // Fills the 'time' input field with the current time of the booking being edited.

        editingIndex = index; 
        // Sets editingIndex to the index of the booking being edited, entering edit mode.
      }

      
/*The main difference between the initial code you shared and the final version with editingIndex is 
  the approach to handling edits on the booking entries. Here's a breakdown of the key differences:

### 1. Edit Mode Handling
# Initial Code: In the initial code, when the user clicked "Edit" on a booking, the code:
  Fetched the booking data into the form fields.
  Immediately deleted that booking from the array, assuming the user would re-add it upon form submission.

#Final Code with editingIndex: Instead of deleting the booking immediately, the editingIndex variable keeps track of which booking is being edited.
  If editingIndex is not null, the form submission updates the booking at that specific index without deleting it first.
  This preserves the booking during editing and reduces the risk of data loss if the user doesn't complete the form submission.

###2. Logic Separation for Adding vs. Editing
#Initial Code: The code didn’t differentiate between add and edit modes, so both actions were handled as if they were new entries.
 After deleting a booking for editing, the form submission always added it back as a new entry.

 #Final Code with editingIndex: There’s now a clear distinction:
  When editingIndex is null, a new booking is added.
  When editingIndex has a value, the existing booking at that index is updated.


###  3. Preserving the Booking List Consistency
#Initial Code: 
    Deletes the booking during editing, so if the user didn’t re-submit the form, the booking would be lost from the list.

#Final Code with editingIndex: 
    Ensures that no deletion occurs during editing, so the booking list remains unchanged until the form is submitted, either adding or updating the entry as required.

Summary
The editingIndex variable makes the code more robust by providing a way to safely handle edits. 
It avoids premature deletion and allows for clearer separation between adding and editing, 
ensuring the booking data remains consistent and user-friendly.*/