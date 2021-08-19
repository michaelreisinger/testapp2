import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-container',
  templateUrl: './container.component.html',
  styleUrls: ['./container.component.css']
})
export class ContainerComponent implements OnInit {
  color: string;

  constructor() { }

  ngOnInit(): void {
    this.color = "#60ccd6";
  }

  style: string;

  onColorChange(color: string): string {
    this.color = color;
    console.log(this.color);
    return this.color;
  }

}
