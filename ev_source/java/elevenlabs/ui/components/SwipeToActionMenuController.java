package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003R.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/ui/components/SwipeToActionMenuController;", "", "<init>", "()V", "Lh5/g;", "offset", "Lsn/z;", "show-jo-Fl9I", "(J)V", "show", "hide", "Lkotlin/Function1;", "showMenu", "Lho/l;", "getShowMenu$ui_release", "()Lho/l;", "setShowMenu$ui_release", "(Lho/l;)V", "Lkotlin/Function0;", "hideMenu", "Lho/a;", "getHideMenu$ui_release", "()Lho/a;", "setHideMenu$ui_release", "(Lho/a;)V", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SwipeToActionMenuController {
    public static final int $stable = 8;
    private ho.l showMenu = new v0(13);
    private ho.a hideMenu = new t2(3);

    /* renamed from: show-jo-Fl9I$default, reason: not valid java name */
    public static /* synthetic */ void m1881showjoFl9I$default(SwipeToActionMenuController swipeToActionMenuController, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = 0;
        }
        swipeToActionMenuController.m1882showjoFl9I(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sn.z showMenu$lambda$0(h5.g gVar) {
        return sn.z.f31622a;
    }

    /* renamed from: getHideMenu$ui_release, reason: from getter */
    public final ho.a getHideMenu() {
        return this.hideMenu;
    }

    /* renamed from: getShowMenu$ui_release, reason: from getter */
    public final ho.l getShowMenu() {
        return this.showMenu;
    }

    public final void hide() {
        this.hideMenu.invoke();
    }

    public final void setHideMenu$ui_release(ho.a aVar) {
        aVar.getClass();
        this.hideMenu = aVar;
    }

    public final void setShowMenu$ui_release(ho.l lVar) {
        lVar.getClass();
        this.showMenu = lVar;
    }

    /* renamed from: show-jo-Fl9I, reason: not valid java name */
    public final void m1882showjoFl9I(long offset) {
        this.showMenu.invoke(new h5.g(offset));
    }
}
