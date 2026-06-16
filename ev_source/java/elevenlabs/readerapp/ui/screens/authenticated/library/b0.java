package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements ho.l {
    public final /* synthetic */ float Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15803a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LibraryState f15804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f15805c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f15806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f15807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho.l f15808f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f15809x0;

    public /* synthetic */ b0(LibraryState libraryState, float f10, ho.l lVar, ho.a aVar, ho.a aVar2, ho.p pVar, ho.l lVar2, float f11) {
        this.f15804b = libraryState;
        this.f15807e = f10;
        this.f15805c = lVar;
        this.f15806d = aVar;
        this.Z = aVar2;
        this.f15809x0 = pVar;
        this.f15808f = lVar2;
        this.Y = f11;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z LibraryScreenUI$lambda$7$0$10$4$0;
        sn.z LibraryScreenUI$lambda$7$0$10$7$0;
        switch (this.f15803a) {
            case 0:
                LibraryScreenUI$lambda$7$0$10$4$0 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$4$0(this.f15804b, this.f15807e, this.f15805c, this.f15806d, (ho.a) this.Z, (ho.p) this.f15809x0, this.f15808f, this.Y, (t1.t) obj);
                return LibraryScreenUI$lambda$7$0$10$4$0;
            default:
                LibraryScreenUI$lambda$7$0$10$7$0 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$7$0(this.f15804b, (List) this.Z, this.f15805c, this.f15806d, (List) this.f15809x0, this.f15807e, this.f15808f, this.Y, (t1.t) obj);
                return LibraryScreenUI$lambda$7$0$10$7$0;
        }
    }

    public /* synthetic */ b0(LibraryState libraryState, List list, ho.l lVar, ho.a aVar, List list2, float f10, ho.l lVar2, float f11) {
        this.f15804b = libraryState;
        this.Z = list;
        this.f15805c = lVar;
        this.f15806d = aVar;
        this.f15809x0 = list2;
        this.f15807e = f10;
        this.f15808f = lVar2;
        this.Y = f11;
    }
}
