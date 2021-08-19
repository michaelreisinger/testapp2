import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { ApiService } from 'src/app/api.service';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css']
})
export class ButtonComponent implements OnInit {

  btnText: string;
  err: string;
  click : boolean = false;
  color: string;
  // trigger events using this
  //@Output() colorChange: EventEmitter<string> = new EventEmitter<string>();

  constructor(private api: ApiService) { }

  ngOnInit(): void {
    this.color = "still in frontend!";
    this.btnText = "Test Backend";
    this.click = false;
  }

  testConnection() {
    this.api.testApi()
    .subscribe( 
      (data) => {
        console.log(data);
      this.color = data;
     // this.colorChange.emit(this.color);
    }, (error) => {
        console.log(error);
        this.err = error;
    });
    this.onButtonClick();
  }  

  onButtonClick(){
    this.click = !this.click;
  }
}
