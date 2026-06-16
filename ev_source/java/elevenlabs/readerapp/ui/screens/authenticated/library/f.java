package io.elevenlabs.readerapp.ui.screens.authenticated.library;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LibraryState f15832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f15833c;

    public /* synthetic */ f(ho.l lVar, LibraryState libraryState, int i10) {
        this.f15831a = i10;
        this.f15833c = lVar;
        this.f15832b = libraryState;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z Tabs$lambda$0$0$0;
        sn.z Tabs$lambda$0$0$1;
        sn.z Tabs$lambda$0$0$2;
        sn.z LibraryScreenUI$lambda$7$0$10$4$0$1;
        sn.z LibraryScreenUI$lambda$7$0$10$7$0$1;
        int i10 = this.f15831a;
        t1.b bVar = (t1.b) obj;
        u2.m mVar = (u2.m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                Tabs$lambda$0$0$0 = LibraryScreenKt.Tabs$lambda$0$0$0(this.f15832b, this.f15833c, bVar, mVar, intValue);
                return Tabs$lambda$0$0$0;
            case 1:
                Tabs$lambda$0$0$1 = LibraryScreenKt.Tabs$lambda$0$0$1(this.f15832b, this.f15833c, bVar, mVar, intValue);
                return Tabs$lambda$0$0$1;
            case 2:
                Tabs$lambda$0$0$2 = LibraryScreenKt.Tabs$lambda$0$0$2(this.f15832b, this.f15833c, bVar, mVar, intValue);
                return Tabs$lambda$0$0$2;
            case 3:
                LibraryScreenUI$lambda$7$0$10$4$0$1 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$4$0$1(this.f15833c, this.f15832b, bVar, mVar, intValue);
                return LibraryScreenUI$lambda$7$0$10$4$0$1;
            default:
                LibraryScreenUI$lambda$7$0$10$7$0$1 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$7$0$1(this.f15833c, this.f15832b, bVar, mVar, intValue);
                return LibraryScreenUI$lambda$7$0$10$7$0$1;
        }
    }

    public /* synthetic */ f(LibraryState libraryState, ho.l lVar, int i10) {
        this.f15831a = i10;
        this.f15832b = libraryState;
        this.f15833c = lVar;
    }
}
