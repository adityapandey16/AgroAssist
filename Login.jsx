
import React, { useState } from 'react';
import axios from 'axios';

const Login = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('http://your-backend-url/api/login', {
        email,
        password
        
      });
      
      if (response.data.token) {
        localStorage.setItem('token', response.data.token);
        // Redirect to dashboard or home page
      }
    } catch (error) {
      console.error('Login failed:', error);
      // Handle login error (show error message to user)
    }
  };

  return (
    <div className="flex flex-col min-h-screen bg-gray-100">
      <div className="flex-grow flex items-center justify-center">
        <div className="bg-customWhite p-8 rounded-lg shadow-md w-96">
          <h2 className="text-2xl font-bold mb-6 text-center text-customBlack">Login</h2>
          <form onSubmit={handleSubmit}>
            <div className="mb-4">
              <label htmlFor="email" className="block text-customGray text-sm font-semibold mb-2">
                Email
              </label>
              <input
                type="email"
                id="email"
                placeholder="Enter your email"
                className="w-full p-3 border border-gray-300 rounded-lg text-customWhite bg-customBlack focus:outline-none focus:ring-2 focus:ring-customGreenNeon"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
              />
            </div>
            <div className="mb-6">
              <label htmlFor="password" className="block text-customGray text-sm font-semibold mb-2">
                Password
              </label>
              <input
                type="password"
                id="password"
                placeholder="Enter your password"
                className="w-full p-3 border border-gray-300 rounded-lg text-customWhite bg-customBlack focus:outline-none focus:ring-2 focus:ring-customGreenNeon"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
              />
            </div>
            <button
              type="submit"
              className="w-full bg-customGreenNeon text-customBlack font-semibold py-3 rounded-lg shadow-md hover:bg-customGreenMedium focus:outline-none focus:ring-2 focus:ring-customGreenDark focus:ring-opacity-50"
            >
              Login
            </button>
          </form>
        </div>
      </div>
      <footer className="bg-[#6BAA75] py-4 text-center text-customBlack">
        <p>&copy; 2023 Your Company Name. All rights reserved.</p>
      </footer>
    </div>
  );
};

export default Login;











