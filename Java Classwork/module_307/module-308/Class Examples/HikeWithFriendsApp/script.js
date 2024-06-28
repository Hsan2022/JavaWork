const container = document.querySelector(".container");
const pwShowHide = document.querySelectorAll(".showHidePw");
const pwFields = document.querySelectorAll(".password");
const signUp = document.querySelector(".signup-link");
const login = document.querySelector(".login-link");

// Function to toggle password visibility and change icon
pwShowHide.forEach(eyeIcon => {
    eyeIcon.addEventListener("click", () => {
        pwFields.forEach(pwField => {
            if (pwField.type === "password") {
                pwField.type = "text";
                eyeIcon.classList.replace("uil-eye-slash", "uil-eye");
            } else {
                pwField.type = "password";
                eyeIcon.classList.replace("uil-eye", "uil-eye-slash");
            }
        });
    });
});

// Event listener for showing signup form
signUp.addEventListener("click", () => {
    container.classList.add("active");
});

// Event listener for showing login form
login.addEventListener("click", () => {
    container.classList.remove("active");
});
