"use client";

import { useForm } from "react-hook-form";
import {
  Form,
  FormControl,
  FormField,
  FormItem,
  FormLabel,
  FormMessage,
} from "@/components/ui/form";
import { Input } from "@/components/ui/input";
import { Button } from "@/components/ui/button";
import { Transaction } from "@prisma/client";
import { createTransaction } from "@/service/transaction";

interface FormValues {
  type: string;
  category: string;
  amount: number;
  description: string;
  date: Date;
  username: string;
}

export default function DemoPage() {
  // 1. Define your form.
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm<FormValues>({
    defaultValues: {
      type: "",
      category: "",
      amount: 0,
      description: "",
      date: new Date(),
      username: "",
    },
  });

  // 2. Define a submit handler.
  function onSubmit(values: FormValues) {
    // Do something with the form values.
    console.log(values);
    let t: Transaction = {
      id: 0,
      type: values.type,
      category: values.category,
      amount: values.amount,
      description: values.description,
      date: values.date,
    };
    createTransaction(t);
  }

  return (
    <div className="container mx-auto py-10">
      <form onSubmit={handleSubmit(onSubmit)} className="space-y-8">
        <div>
          <label className="block text-sm font-medium">Type</label>
          <input
            type="text"
            {...register("type", { required: "Type is required" })}
            className={`mt-1 block w-full ${
              errors.type ? "border-red-500" : "border-gray-300"
            }`}
            placeholder="income / expense"
          />
          {errors.type && (
            <p className="mt-2 text-sm text-red-600">{errors.type.message}</p>
          )}
        </div>

        <div>
          <label className="block text-sm font-medium">Category</label>
          <input
            type="text"
            {...register("category", { required: "Category is required" })}
            className={`mt-1 block w-full ${
              errors.category ? "border-red-500" : "border-gray-300"
            }`}
            placeholder="category"
          />
          {errors.category && (
            <p className="mt-2 text-sm text-red-600">
              {errors.category.message}
            </p>
          )}
        </div>

        <div>
          <label className="block text-sm font-medium">Amount</label>
          <input
            type="text"
            {...register("amount", {
              required: "Amount is required",
              valueAsNumber: true, // Ensure the value is treated as a number
              validate: (value) => !isNaN(value) || "Amount must be a number",
            })}
            className={`mt-1 block w-full ${
              errors.amount ? "border-red-500" : "border-gray-300"
            }`}
            placeholder="€"
          />
          {errors.amount && (
            <p className="mt-2 text-sm text-red-600">{errors.amount.message}</p>
          )}
        </div>

        <Button type="submit">Submit</Button>
      </form>
    </div>
  );
}
