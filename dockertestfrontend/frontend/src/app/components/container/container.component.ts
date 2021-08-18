import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-container',
  templateUrl: './container.component.html',
  styleUrls: ['./container.component.css']
})
export class ContainerComponent implements OnInit {
  test: string;
  color: string;

  constructor() { }

  ngOnInit(): void {
    this.test = "Still inside the frontend part of the application!";
    this.color = "#60ccd6";
  }

}
