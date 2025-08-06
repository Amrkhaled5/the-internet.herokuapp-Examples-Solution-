# The Internet Challenges - Selenium Automation Solutions 🚀

A comprehensive collection of Selenium WebDriver automation solutions for all challenges available on [The Internet](https://the-internet.herokuapp.com/) - the ultimate practice ground for web automation testing.

## 🎯 About The Project

This repository contains complete Selenium WebDriver solutions for every challenge presented on [The Internet](https://the-internet.herokuapp.com/) website. Each challenge is designed to test different aspects of web automation, from basic element interactions to complex scenarios like handling dynamic content, file uploads, and authentication.

**Perfect for:**
- 🎓 Learning Selenium WebDriver automation
- 💼 Preparing for automation testing interviews
- 🏋️ Practicing advanced web testing scenarios
- 📚 Understanding real-world testing challenges

## 🏆 Challenges Covered

This repository includes solutions for **40+ challenges**, including:

### Basic Interactions
- ✅ **A/B Testing** - Handle dynamic content testing
- ✅ **Add/Remove Elements** - Dynamic element manipulation
- ✅ **Checkboxes** - Checkbox selection and validation
- ✅ **Dropdown** - Dropdown menu interactions
- ✅ **Inputs** - Input field handling

### Authentication & Security
- ✅ **Basic Auth** - HTTP Basic Authentication
- ✅ **Digest Authentication** - HTTP Digest Authentication
- ✅ **Form Authentication** - Web form login/logout
- ✅ **Secure File Download** - Authenticated file downloads

### Advanced Interactions
- ✅ **Drag and Drop** - Drag and drop functionality
- ✅ **Horizontal Slider** - Slider control manipulation
- ✅ **Hovers** - Mouse hover interactions
- ✅ **Context Menu** - Right-click context menus
- ✅ **Key Presses** - Keyboard event handling

### Dynamic Content
- ✅ **Dynamic Content** - Handle changing content
- ✅ **Dynamic Controls** - Manage dynamic form controls
- ✅ **Dynamic Loading** - Wait for dynamically loaded elements
- ✅ **Disappearing Elements** - Handle intermittent elements

### File Operations
- ✅ **File Upload** - Upload files to web applications
- ✅ **File Download** - Download files from web applications

### Complex Scenarios
- ✅ **Multiple Windows** - Handle multiple browser windows/tabs
- ✅ **Frames & Nested Frames** - Work with iframes
- ✅ **JavaScript Alerts** - Handle alert, confirm, and prompt dialogs
- ✅ **Shadow DOM** - Interact with Shadow DOM elements
- ✅ **Infinite Scroll** - Handle infinite scrolling pages

### Data & Tables
- ✅ **Sortable Data Tables** - Sort and validate table data
- ✅ **Large & Deep DOM** - Handle complex DOM structures
- ✅ **Challenging DOM** - Work with dynamic IDs and classes

### UI/UX Testing
- ✅ **Broken Images** - Identify broken images
- ✅ **Typos** - Text validation and typo detection
- ✅ **Notification Messages** - Handle flash messages
- ✅ **Shifting Content** - Deal with shifting layouts

### Advanced Features
- ✅ **WYSIWYG Editor** - Rich text editor automation
- ✅ **JQuery UI Menus** - Navigate JQuery UI components
- ✅ **Geolocation** - Handle location-based features
- ✅ **Exit Intent & Entry Ad** - Popup and modal handling

## 🏗️ Project Structure

```
├── src/
│   ├── main/java/
│   │   └── pages/
│   │       ├── ABTestPage.java
│   │       ├── AddRemoveElementsPage.java
│   │       ├── BasicAuthPage.java
│   │       ├── CheckboxesPage.java
│   │       └── ... (page classes for each challenge)
│   └── test/java/
│       └── tests/
│           ├── ABTestTest.java
│           ├── AddRemoveElementsTest.java
│           ├── BasicAuthTest.java
│           ├── CheckboxesTest.java
│           └── ... (test classes for each challenge)
├── drivers/
│   └── (WebDriver executables)
├── testng.xml
├── pom.xml
└── README.md
```

### Architecture Pattern

This project follows the **Page Object Model (POM)** design pattern:

- **Page Classes**: Each challenge has a dedicated page class containing all Selenium WebDriver code and element locators
- **Test Classes**: Each page class has a corresponding test class with comprehensive assertions and test scenarios
- **Clean Separation**: Business logic is separated from test logic for better maintainability


## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/AmazingFeature`)
3. **Commit** your changes (`git commit -m 'Add some AmazingFeature'`)
4. **Push** to the branch (`git push origin feature/AmazingFeature`)
5. **Open** a Pull Request

### Contribution Guidelines
- Follow existing code style and patterns
- Add appropriate assertions in test methods
- Include JavaDoc comments for new methods
- Ensure all tests pass before submitting PR
- Update README if adding new features

⭐ **Star this repository if it helped you learn Selenium automation!** ⭐

**Happy Testing!** 🚀
