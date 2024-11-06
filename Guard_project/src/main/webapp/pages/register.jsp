<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
</head>
<body style="font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 50px;">

    <div style="max-width: 400px; margin: auto; background: white; padding: 20px; border-radius: 5px; box-shadow: 0 2px 10px rgba(0,0,0,0.1);">
        <h2 style="text-align: center;">Register</h2>
        <form action="registerdata">
            <div style="margin-bottom: 15px;">
                <label for="name" style="display: block;">Name:</label>
                <input type="text" id="name" name="gname" required style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 4px;">
            </div>
            <div style="margin-bottom: 15px;">
                <label for="email" style="display: block;">Email:</label>
                <input type="email" id="email" name="gemail" required style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 4px;">
            </div>
            <div style="margin-bottom: 15px;">
                <label for="password" style="display: block;">Password:</label>
                <input type="password" id="password" name="gpass" required style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 4px;">
            </div>
            <div style="margin-bottom: 15px;">
                <label for="confirm-password" style="display: block;">Confirm Password:</label>
                <input type="password" id="confirm-password" name="gcpass" required style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 4px;">
            </div>
            <button type="submit" style="width: 100%; padding: 10px; background-color: #28a745; color: white; border: none; border-radius: 4px; cursor: pointer;">Register</button>
        </form>
    </div>

</body>
</html>
