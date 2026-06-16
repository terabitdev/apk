package io.elevenlabs.readerapp;

import ho.q;
import ho.r;
import i1.j2;
import i1.o;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.readerapp.core.router.RouterKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkShareDisclaimerSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreCollectionsSectionKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import na.c0;
import r1.s;
import r1.y;
import sn.z;
import u2.m;
import u2.s2;
import w1.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14495c;

    public /* synthetic */ e(c0 c0Var, j2 j2Var) {
        this.f14493a = 1;
        this.f14494b = c0Var;
        this.f14495c = j2Var;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        z onCreate$lambda$1$0$0$2;
        z Router$lambda$20$0$4$0$0$120;
        z BookmarkShareDisclaimerSheet$lambda$0;
        z EditBookmarkSheet$lambda$1;
        z VoicePickerScreen$lambda$11;
        z BottomSheetScaffold_jb_40ds$lambda$0;
        z EchoBottomSheetScaffold$lambda$1;
        z BottomSheetScaffold_jb_40ds$lambda$2;
        switch (this.f14493a) {
            case 0:
                onCreate$lambda$1$0$0$2 = MainActivity.onCreate$lambda$1$0$0$2((MainActivity) this.f14495c, (c0) this.f14494b, (s) obj, (h5.f) obj2, (m) obj3, ((Integer) obj4).intValue());
                return onCreate$lambda$1$0$0$2;
            case 1:
                Router$lambda$20$0$4$0$0$120 = RouterKt.Router$lambda$20$0$4$0$0$120((c0) this.f14494b, (j2) this.f14495c, (o) obj, (na.j) obj2, (m) obj3, ((Integer) obj4).intValue());
                return Router$lambda$20$0$4$0$0$120;
            case 2:
                BookmarkShareDisclaimerSheet$lambda$0 = BookmarkShareDisclaimerSheetKt.BookmarkShareDisclaimerSheet$lambda$0((ho.a) this.f14495c, (ho.a) this.f14494b, (y) obj, (BottomSheetControl) obj2, (m) obj3, ((Integer) obj4).intValue());
                return BookmarkShareDisclaimerSheet$lambda$0;
            case 3:
                EditBookmarkSheet$lambda$1 = EditBookmarkSheetKt.EditBookmarkSheet$lambda$1((Bookmark) this.f14495c, (EditBookmarkViewModel) this.f14494b, (y) obj, (BottomSheetControl) obj2, (m) obj3, ((Integer) obj4).intValue());
                return EditBookmarkSheet$lambda$1;
            case 4:
                VoicePickerScreen$lambda$11 = VoicePickerScreenKt.VoicePickerScreen$lambda$11((VoicePickerViewModel) this.f14495c, (s2) this.f14494b, (y) obj, (BottomSheetControl) obj2, (m) obj3, ((Integer) obj4).intValue());
                return VoicePickerScreen$lambda$11;
            case 5:
                return VoicePickerExploreCollectionsSectionKt.f((ExploreVoiceSections.Section.VoiceCollections) this.f14495c, (ho.l) this.f14494b, (w) obj, ((Integer) obj2).intValue(), (m) obj3, ((Integer) obj4).intValue());
            case 6:
                BottomSheetScaffold_jb_40ds$lambda$0 = BottomSheetScaffoldKt.BottomSheetScaffold_jb_40ds$lambda$0((String) this.f14495c, (r) this.f14494b, (y) obj, (BottomSheetControl) obj2, (m) obj3, ((Integer) obj4).intValue());
                return BottomSheetScaffold_jb_40ds$lambda$0;
            case 7:
                EchoBottomSheetScaffold$lambda$1 = BottomSheetScaffoldKt.EchoBottomSheetScaffold$lambda$1((q) this.f14495c, (r) this.f14494b, (y) obj, (BottomSheetControl) obj2, (m) obj3, ((Integer) obj4).intValue());
                return EchoBottomSheetScaffold$lambda$1;
            default:
                BottomSheetScaffold_jb_40ds$lambda$2 = BottomSheetScaffoldKt.BottomSheetScaffold_jb_40ds$lambda$2((r) this.f14495c, (r) this.f14494b, (y) obj, (BottomSheetControl) obj2, (m) obj3, ((Integer) obj4).intValue());
                return BottomSheetScaffold_jb_40ds$lambda$2;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, int i10) {
        this.f14493a = i10;
        this.f14495c = obj;
        this.f14494b = obj2;
    }
}
