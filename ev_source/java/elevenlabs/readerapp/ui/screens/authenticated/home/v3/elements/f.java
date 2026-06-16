package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements;

import ho.l;
import ho.p;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeRecentReadsCarouselKt;
import java.util.List;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements p {
    public final /* synthetic */ l Y;
    public final /* synthetic */ int Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15637a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f15639c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f15640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f15641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f15642f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f15643x0;

    public /* synthetic */ f(String str, List list, t tVar, List list2, l lVar, l lVar2, int i10, int i11) {
        this.f15638b = str;
        this.f15639c = list;
        this.f15641e = tVar;
        this.f15640d = list2;
        this.f15642f = lVar;
        this.Y = lVar2;
        this.Z = i10;
        this.f15643x0 = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z HomeReadsCarouselV3$lambda$7;
        z HomeRecentReadsCarouselV4$lambda$4;
        switch (this.f15637a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                HomeReadsCarouselV3$lambda$7 = HomeReadsCarouselKt.HomeReadsCarouselV3$lambda$7(this.f15638b, this.f15639c, this.f15641e, this.f15640d, this.f15642f, this.Y, this.Z, this.f15643x0, (m) obj, intValue);
                return HomeReadsCarouselV3$lambda$7;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                String str = this.f15638b;
                List list = this.f15639c;
                t tVar = this.f15641e;
                HomeRecentReadsCarouselV4$lambda$4 = HomeRecentReadsCarouselKt.HomeRecentReadsCarouselV4$lambda$4(str, list, this.f15640d, tVar, this.f15642f, this.Y, this.Z, this.f15643x0, (m) obj, intValue2);
                return HomeRecentReadsCarouselV4$lambda$4;
        }
    }

    public /* synthetic */ f(String str, List list, List list2, t tVar, l lVar, l lVar2, int i10, int i11) {
        this.f15638b = str;
        this.f15639c = list;
        this.f15640d = list2;
        this.f15641e = tVar;
        this.f15642f = lVar;
        this.Y = lVar2;
        this.Z = i10;
        this.f15643x0 = i11;
    }
}
