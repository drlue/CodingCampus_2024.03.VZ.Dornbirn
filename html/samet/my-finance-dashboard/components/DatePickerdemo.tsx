"use client"

import React from "react";
import { format, startOfMonth } from "date-fns";
import { Calendar as CalendarIcon } from "lucide-react";
import { cn } from "@/lib/utils";
import { Button } from "@/components/ui/button";
import { Calendar } from "@/components/ui/calendar";
import { Popover, PopoverContent, PopoverTrigger } from "@/components/ui/popover";

interface DatePickerDemoProps {
  initialDate: Date;
}

export function DatePickerDemo({ initialDate }: DatePickerDemoProps) {
  const [date, setDate] = React.useState<Date | undefined>(initialDate);

  const handleSelectDate = (day: Date | undefined) => {
    setDate(day ?? undefined);
  };

  return (
    <Popover>
      <PopoverTrigger asChild>
        <Button
          variant={"outline"}
          className={cn(
            "w-[280px] justify-start text-left font-normal",
            !date && "text-muted-foreground"
          )}
        >
          <CalendarIcon className="mr-2 h-4 w-4" />
          {date ? format(date, "PPP") : <span>Pick a date</span>}
        </Button>
      </PopoverTrigger>
      <PopoverContent className="w-auto p-0">
        <Calendar
          mode="single"
          selected={date}
          onSelect={handleSelectDate}
          
        />
      </PopoverContent>
    </Popover>
  );
}

export function MonthLinks() {
  const months = [
    { name: "January", index: 0 },
    { name: "February", index: 1 },
    { name: "March", index: 2 },
    { name: "April", index: 3 },
    { name: "May", index: 4 },
    { name: "June", index: 5 },
    { name: "July", index: 6 },
    { name: "August", index: 7 },
    { name: "September", index: 8 },
    { name: "October", index: 9 },
    { name: "November", index: 10 },
    { name: "December", index: 11 },
  ];

  return (
    <div className="grid grid-rows-12 gap-5 text-center text-xs rounded-3xl pt-6 pb-5 ml-4 mr-4 mb-4 w-14">
      {months.map((month) => (
        <Popover key={month.name}>
          <PopoverTrigger asChild>
            <button className="hover:underline">
              {month.name.substring(0, 3).toUpperCase()}
            </button>
          </PopoverTrigger>
          <PopoverContent className="w-auto p-0">
            <DatePickerDemo initialDate={startOfMonth(new Date(new Date().getFullYear(), month.index))} />
          </PopoverContent>
        </Popover>
      ))}
    </div>
  );
}
