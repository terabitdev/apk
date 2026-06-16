package io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements;

import ho.l;
import ho.p;
import i3.t;
import io.elevenlabs.readerapp.ui.components.explore.BookCoverSize;
import io.elevenlabs.ui.components.SelectKt;
import java.util.List;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15471a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f15473c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15476f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ sn.d f15477x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f15478y0;

    public /* synthetic */ g(String str, p pVar, p pVar2, t tVar, ho.a aVar, int i10, String str2, int i11, int i12) {
        this.f15472b = str;
        this.Y = pVar;
        this.Z = pVar2;
        this.f15473c = tVar;
        this.f15477x0 = aVar;
        this.f15474d = i10;
        this.f15478y0 = str2;
        this.f15475e = i11;
        this.f15476f = i12;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z BookGridRow$lambda$2;
        z Select$lambda$10;
        switch (this.f15471a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BookGridRow$lambda$2 = ExploreLargeGridCollectionKt.BookGridRow$lambda$2((List) this.Y, this.f15474d, (BookCoverSize) this.Z, (l) this.f15477x0, this.f15473c, (l) this.f15478y0, this.f15472b, this.f15475e, this.f15476f, (m) obj, intValue);
                return BookGridRow$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                Select$lambda$10 = SelectKt.Select$lambda$10(this.f15472b, (p) this.Y, (p) this.Z, this.f15473c, (ho.a) this.f15477x0, this.f15474d, (String) this.f15478y0, this.f15475e, this.f15476f, (m) obj, intValue2);
                return Select$lambda$10;
        }
    }

    public /* synthetic */ g(List list, int i10, BookCoverSize bookCoverSize, l lVar, t tVar, l lVar2, String str, int i11, int i12) {
        this.Y = list;
        this.f15474d = i10;
        this.Z = bookCoverSize;
        this.f15477x0 = lVar;
        this.f15473c = tVar;
        this.f15478y0 = lVar2;
        this.f15472b = str;
        this.f15475e = i11;
        this.f15476f = i12;
    }
}
