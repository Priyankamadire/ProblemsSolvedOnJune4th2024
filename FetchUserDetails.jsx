import React, { useState, useEffect } from "react";

const FetchUserDetails = () => {
  const [users, setUsers] = useState([]);
  const fetchdetail = () => {
    fetch("https://jsonplaceholder.typicode.com/users")
      .then((response) => response.json())
      .then((json) => setUsers(json));
  };
  useEffect(() => {
    fetchdetail();
  }, []);
  return (
    <div className="card">
      {users.map((user) => (
        <div className="card-inner">
          <p>{user.name}</p>
          <p>{user.username}</p>
        </div>
      ))}
    </div>
  );
};

export default FetchUserDetails;
