package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15850b;

    public /* synthetic */ i0(Object obj, int i10) {
        this.f15849a = i10;
        this.f15850b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        LibraryState emit$lambda$0;
        sn.z LibraryScreen$lambda$16$0;
        sn.z LibraryScreen$lambda$20$0$0;
        LibraryState selectTab$lambda$0;
        switch (this.f15849a) {
            case 0:
                emit$lambda$0 = LibraryViewModel.AnonymousClass6.AnonymousClass1.emit$lambda$0((MediaQueueState) this.f15850b, (LibraryState) obj);
                return emit$lambda$0;
            case 1:
                LibraryScreen$lambda$16$0 = LibraryScreenKt.LibraryScreen$lambda$16$0((LibraryViewModel) this.f15850b, (ho.l) obj);
                return LibraryScreen$lambda$16$0;
            case 2:
                LibraryScreen$lambda$20$0$0 = LibraryScreenKt.LibraryScreen$lambda$20$0$0((ho.p) this.f15850b, (String) obj);
                return LibraryScreen$lambda$20$0$0;
            default:
                selectTab$lambda$0 = LibraryViewModel.selectTab$lambda$0((LibraryTab) this.f15850b, (LibraryState) obj);
                return selectTab$lambda$0;
        }
    }
}
