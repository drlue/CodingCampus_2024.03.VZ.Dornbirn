<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = htmlspecialchars($_POST['name']);
    $email = htmlspecialchars($_POST['email']);
    $message = htmlspecialchars($_POST['message']);

    
    if (!empty($name) && !empty($email) && !empty($message)) {
        echo "Danke, $name! Ihre Nachricht wurde empfangen.<br>";
        echo "Ihre E-Mail: $email<br>";
        echo "Ihre Nachricht: $message";
    } else {
        echo "Bitte füllen Sie alle Felder aus.";
    }
} else {
    
    header("Location: form.html");
    exit;
}
?>
