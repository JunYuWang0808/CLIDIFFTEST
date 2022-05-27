public int keyDownEvent (int wParam, int lParam) {
       switch (wParam) {
         case OS.VK_SPACE:
         case OS.VK_RETURN:
         Event event = new Event ();
	 event.item = focusItem;
         sendEvent(focusItem.expanded ? COLLAPSE:EXPAND, event);
         refreshItem(focusItem);
       }
  }
