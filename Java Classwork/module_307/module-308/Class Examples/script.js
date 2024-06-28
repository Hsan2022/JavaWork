document.getElementById('signupForm').addEventListener('submit', function(event) {
  event.preventDefault();

  // Get form values
  var name = document.getElementById('name').value;
  var email = document.getElementById('email').value;
  var date = document.getElementById('date').value;
  var location = document.getElementById('location').value;

  // Create a new table row
  var newRow = `<tr>
                  <td>${name}</td>
                  <td>${email}</td>
                  <td>${date}</td>
                  <td>${location}</td>
                </tr>`;

  // Append the new row to the table body
  var tableBody = document.getElementById('signupTableBody');
  tableBody.innerHTML += newRow;

  // Display confirmation message (you can customize this as needed)
  alert(`Thank you, ${name}! You are signed up for the hike on ${date} at ${location}. We will contact you at ${email} with further details.`);

  // Optionally, you can clear the form fields after submission
  document.getElementById('signupForm').reset();
});
  