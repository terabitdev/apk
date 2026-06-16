package io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements;

import f4.r;
import ho.l;
import ho.p;
import i3.t;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.readerapp.ui.components.explore.BookCoverSize;
import io.elevenlabs.ui.components.SliderKt;
import l1.n;
import p3.y;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements p {
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15463a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f15464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f15467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15468f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f15469x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f15470y0;

    public /* synthetic */ f(float f10, l lVar, String str, t tVar, String str2, ho.a aVar, no.d dVar, int i10, int i11) {
        this.f15464b = f10;
        this.f15465c = lVar;
        this.f15466d = str;
        this.f15467e = tVar;
        this.f15469x0 = str2;
        this.f15468f = aVar;
        this.f15470y0 = dVar;
        this.Y = i10;
        this.Z = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z LargeBookGridItem__b7W0Lw$lambda$2;
        z Slider$lambda$3;
        switch (this.f15463a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LargeBookGridItem__b7W0Lw$lambda$2 = ExploreLargeGridCollectionKt.LargeBookGridItem__b7W0Lw$lambda$2((ExploreRead) this.f15469x0, (ho.a) this.f15468f, (BookCoverSize) this.f15470y0, this.f15464b, this.f15467e, (l) this.f15465c, this.f15466d, this.Y, this.Z, (m) obj, intValue);
                return LargeBookGridItem__b7W0Lw$lambda$2;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Slider$lambda$3 = SliderKt.Slider$lambda$3(this.f15464b, (l) this.f15465c, this.f15466d, this.f15467e, (String) this.f15469x0, (ho.a) this.f15468f, (no.d) this.f15470y0, this.Y, this.Z, (m) obj, intValue2);
                return Slider$lambda$3;
            default:
                ((Integer) obj2).getClass();
                n.c((u3.c) this.f15469x0, this.f15466d, this.f15467e, (i3.g) this.f15468f, (r) this.f15470y0, this.f15464b, (y) this.f15465c, (m) obj, u2.r.M(this.Y | 1), this.Z);
                return z.f31622a;
        }
    }

    public /* synthetic */ f(ExploreRead exploreRead, ho.a aVar, BookCoverSize bookCoverSize, float f10, t tVar, l lVar, String str, int i10, int i11) {
        this.f15469x0 = exploreRead;
        this.f15468f = aVar;
        this.f15470y0 = bookCoverSize;
        this.f15464b = f10;
        this.f15467e = tVar;
        this.f15465c = lVar;
        this.f15466d = str;
        this.Y = i10;
        this.Z = i11;
    }

    public /* synthetic */ f(u3.c cVar, String str, t tVar, i3.g gVar, r rVar, float f10, y yVar, int i10, int i11) {
        this.f15469x0 = cVar;
        this.f15466d = str;
        this.f15467e = tVar;
        this.f15468f = gVar;
        this.f15470y0 = rVar;
        this.f15464b = f10;
        this.f15465c = yVar;
        this.Y = i10;
        this.Z = i11;
    }
}
