public int keyReleaseEvent (int wParam, int lParam) {
   switch (wParam) {
     case OS.GDK_RETURN:
     case OS.GDK_SPACE:
     Event ev = new Event ();
     ev.item = focusItem;
     sendEvent(focusItem.expanded ? COLLAPSE:EXPAND, ev);
     refreshItem(focusItem);
   }
  }
