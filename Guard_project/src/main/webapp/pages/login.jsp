<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
</head>
<body style="font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 50px;">

    <div style="max-width: 400px; margin: auto; background: white; padding: 20px; border-radius: 5px; box-shadow: 0 2px 10px rgba(0,0,0,0.1);">
        <h2 style="text-align: center;">Login</h2>
        <form action="logindata" method="post">
           
            <div style="margin-bottom: 15px;">
                <label for="email" style="display: block;">Email:</label>
                <input type="email" id="email" name="t1" required style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 4px;">
            </div>
            <div style="margin-bottom: 15px;">
                <label for="password" style="display: block;">Password:</label>
                <input type="password" id="password" name="t2" required style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 4px;">
            </div>
           
            <button type="submit" style="width: 100%; padding: 10px; background-color: #28a745; color: white; border: none; border-radius: 4px; cursor: pointer;">Login</button>
        </form>
    </div>

</body>
</html>
