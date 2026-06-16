package io.elevenlabs.readerapp.ui.screens.authenticated.library;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15878d;

    public /* synthetic */ q(ho.a aVar, ho.a aVar2, int i10) {
        this.f15875a = 1;
        this.f15876b = aVar;
        this.f15878d = aVar2;
        this.f15877c = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z DeleteReadConfirmationDialog$lambda$2;
        sn.z LibraryEmptyStateView$lambda$1;
        sn.z Tabs$lambda$1;
        switch (this.f15875a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                DeleteReadConfirmationDialog$lambda$2 = LibraryScreenKt.DeleteReadConfirmationDialog$lambda$2((DeleteConfirmationState) this.f15878d, (ho.a) this.f15876b, this.f15877c, (u2.m) obj, intValue);
                return DeleteReadConfirmationDialog$lambda$2;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                LibraryEmptyStateView$lambda$1 = LibraryScreenKt.LibraryEmptyStateView$lambda$1((ho.a) this.f15876b, (ho.a) this.f15878d, this.f15877c, (u2.m) obj, intValue2);
                return LibraryEmptyStateView$lambda$1;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                Tabs$lambda$1 = LibraryScreenKt.Tabs$lambda$1((ho.l) this.f15878d, (LibraryState) this.f15876b, this.f15877c, (u2.m) obj, intValue3);
                return Tabs$lambda$1;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, int i10, int i11) {
        this.f15875a = i11;
        this.f15878d = obj;
        this.f15876b = obj2;
        this.f15877c = i10;
    }
}
