// JavaScript to add animation to the header text
document.addEventListener("DOMContentLoaded", function() {
    const header = document.querySelector("header h1");
    header.style.opacity = "0";
    header.style.transition = "opacity 2s";
    
    // Set a slight delay for the fade-in effect
    setTimeout(() => {
        header.style.opacity = "1";
    }, 500);
});
