public int buttonUpEvent (int wParam, int lParam) {
   if (lParam == HOVER) {
   Event bEvent = new Event ();
   bEvent.item = focusItem;
   sendEvent(focusItem.expanded ? EXPAND:COLLAPSE, bEvent);
   refreshItem(focusItem);
   }
  }
