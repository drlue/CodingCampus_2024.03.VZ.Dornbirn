import React from "react";

export default function MainContentBottom() {
  return (
    <div className="grid grid-cols-1 sm:grid-cols-4 gap-4 p-4 flex-grow">
      <div className="bg-red-500 rounded-lg shadow-xl sm:col-span-1">
        ASSETS
      </div>
      <div className="bg-orange-500 rounded-lg shadow-xl sm:col-span-2">
        {" "}
        MONTHLY TRACKING
      </div>
      <div className="bg-yellow-500 rounded-lg shadow-xl p-1">        
        EXPENSES IN DIAGRAM AND CATEGORY
      </div>
    </div>
  );
}
