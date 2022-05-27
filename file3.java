public int buttonUpEvent (int wParam, int lParam) {
   ExpandItem item = items [focusIndex];
   if (lParam == HOVER) {
   Event bEvent = new Event ();
   bEvent.item = item;
   sendEvent(true, bEvent);
   }
  }
