public int keyReleaseEvent (int wParam, int lParam) {
   ExpandItem item = items [focusIndex];
   switch (wParam) {
     case OS.GDK_RETURN:
     case OS.GDK_SPACE:
     Event ev = new Event ();
     ev.item = item;
     sendEvent(true, ev);
   }
  }
