document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('signup-form');
    const errorMessage = document.getElementById('error-message');
  
    form.addEventListener('submit', function(e) {
      e.preventDefault();
  
      const fullname = document.getElementById('fullname').value;
      const email = document.getElementById('email').value;
      const password = document.getElementById('password').value;
  
      // You can add more sophisticated validation here if needed
      if (fullname.trim() === '' || email.trim() === '' || password.trim() === '') {
        errorMessage.textContent = 'Please fill in all fields.';
      } else {
        // You can handle the sign-up process here, e.g., submit the data to the server.
        // For this example, let's just show a success message.
        errorMessage.textContent = 'Sign-up successful! Welcome to our gym!';
        form.reset();
      }
    });
  });
  