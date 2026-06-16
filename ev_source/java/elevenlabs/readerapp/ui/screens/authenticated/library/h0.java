package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel;
import java.util.List;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15846c;

    public /* synthetic */ h0(Object obj, Object obj2, int i10) {
        this.f15844a = i10;
        this.f15845b = obj;
        this.f15846c = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        LibraryState invokeSuspend$lambda$0;
        sn.z LibraryScreen$lambda$11$0;
        sn.z Tabs$lambda$0$0;
        sn.z SavedItem$lambda$1$0$0$0;
        LibraryState initialTab$lambda$0;
        switch (this.f15844a) {
            case 0:
                invokeSuspend$lambda$0 = LibraryViewModel.AnonymousClass4.AnonymousClass1.invokeSuspend$lambda$0((List) this.f15845b, (LibraryViewModel) this.f15846c, (LibraryState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                LibraryScreen$lambda$11$0 = LibraryScreenKt.LibraryScreen$lambda$11$0((ho.l) this.f15845b, (z0) this.f15846c, (String) obj);
                return LibraryScreen$lambda$11$0;
            case 2:
                Tabs$lambda$0$0 = LibraryScreenKt.Tabs$lambda$0$0((LibraryState) this.f15845b, (ho.l) this.f15846c, (t1.t) obj);
                return Tabs$lambda$0$0;
            case 3:
                SavedItem$lambda$1$0$0$0 = LibraryScreenKt.SavedItem$lambda$1$0$0$0((ho.l) this.f15845b, (ReadMeta) this.f15846c, (DownloadAction) obj);
                return SavedItem$lambda$1$0$0$0;
            default:
                initialTab$lambda$0 = LibraryViewModel.setInitialTab$lambda$0((LibraryTab) this.f15845b, (LibraryViewModel) this.f15846c, (LibraryState) obj);
                return initialTab$lambda$0;
        }
    }
}
