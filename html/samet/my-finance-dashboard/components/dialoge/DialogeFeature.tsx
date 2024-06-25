import React from "react";
import {
  Dialog,
  DialogContent,
  DialogDescription,
  DialogHeader,
  DialogTitle,
  DialogTrigger,
} from "@/components/ui/dialog";
import DemoPage from "@/app/payments/page";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faPlus } from "@fortawesome/free-solid-svg-icons";

export default function Dialoge() {
  return (
    <Dialog>
      <DialogTrigger>
        <div className="grid justify-center">
          Push for new Transactions
          <div className="flex justify-center p-10">
            <FontAwesomeIcon icon={faPlus} className="h-8" />
          </div>
        </div>
      </DialogTrigger>
      <DialogContent>
        <DialogHeader>
          <DialogTitle className="flex justify-center">
            You can put your Transactions here!
          </DialogTitle>
          <DialogDescription>
            <DemoPage />
          </DialogDescription>
        </DialogHeader>
      </DialogContent>
    </Dialog>
  );
}
