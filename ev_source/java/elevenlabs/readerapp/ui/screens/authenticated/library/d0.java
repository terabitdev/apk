package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import i1.j2;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15821a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15823c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15826f;

    public /* synthetic */ d0(ho.l lVar, ReadMeta readMeta, DeleteConfirmationState deleteConfirmationState, ActionConfig actionConfig, ActionConfig actionConfig2) {
        this.f15823c = actionConfig;
        this.f15822b = lVar;
        this.f15825e = readMeta;
        this.f15824d = actionConfig2;
        this.f15826f = deleteConfirmationState;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z ArchiveItem$lambda$1;
        sn.z LibraryScreenUI$lambda$7$0$10$8$1;
        switch (this.f15821a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                ArchiveItem$lambda$1 = LibraryScreenKt.ArchiveItem$lambda$1((ActionConfig) this.f15823c, this.f15822b, (ReadMeta) this.f15825e, (ActionConfig) this.f15824d, (DeleteConfirmationState) this.f15826f, (ActionSpecBuilder) obj, (u2.m) obj2, intValue);
                return ArchiveItem$lambda$1;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                LibraryScreenUI$lambda$7$0$10$8$1 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$8$1((j2) this.f15823c, (i1.o) this.f15824d, (ho.a) this.f15825e, (LibraryState) this.f15826f, this.f15822b, (l2) obj, (u2.m) obj2, intValue2);
                return LibraryScreenUI$lambda$7$0$10$8$1;
        }
    }

    public /* synthetic */ d0(j2 j2Var, i1.o oVar, ho.a aVar, LibraryState libraryState, ho.l lVar) {
        this.f15823c = j2Var;
        this.f15824d = oVar;
        this.f15825e = aVar;
        this.f15826f = libraryState;
        this.f15822b = lVar;
    }
}
