import React, { useState } from "react";

const LivePara = () => {
  const [live, setLive] = useState("");

  function handleLivePara(e) {
    setLive(e.target.value);
  }

  return (
    <div>
      <textarea
        value={live}
        onChange={handleLivePara}
        rows="10"
        cols="50"
        placeholder="Write your paragraph here..."
        style={{ width: "100%", padding: "10px", fontSize: "16px" }}
      />
      <p>
        <strong>
          Live paragraph:
          <br />
        </strong>
        <em>{live}</em>
      </p>
    </div>
  );
};

export default LivePara;
