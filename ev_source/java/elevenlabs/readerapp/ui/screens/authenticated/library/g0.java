package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15841d;

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f15838a = i10;
        this.f15839b = obj;
        this.f15840c = obj2;
        this.f15841d = obj3;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        LibraryState emit$lambda$0;
        sn.z ArchiveItem$lambda$1$1$0;
        switch (this.f15838a) {
            case 0:
                emit$lambda$0 = LibraryViewModel.AnonymousClass2.AnonymousClass3.emit$lambda$0((Logger) this.f15839b, (LibraryViewModel) this.f15840c, (List) this.f15841d, (LibraryState) obj);
                return emit$lambda$0;
            default:
                ArchiveItem$lambda$1$1$0 = LibraryScreenKt.ArchiveItem$lambda$1$1$0((ActionConfig) this.f15839b, (ReadMeta) this.f15840c, (ActionConfig) this.f15841d, (ActionSpecBuilder.PlacementScope) obj);
                return ArchiveItem$lambda$1$1$0;
        }
    }
}
