public int keyDownEvent (int wParam, int lParam) {
       ExpandItem item = items [focusIndex];
       switch (wParam) {
         case OS.VK_SPACE:
         case OS.VK_RETURN:
         Event event = new Event ();
         event.item = item;
         sendEvent(true, event);
       }
  }
