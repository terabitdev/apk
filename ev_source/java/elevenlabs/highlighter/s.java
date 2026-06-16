package io.elevenlabs.highlighter;

import io.elevenlabs.domain.model.AuthorProfile;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileScreenKt;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements ho.p {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ Object B0;
    public final /* synthetic */ Object C0;
    public final /* synthetic */ Object D0;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14239a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.l f14242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.l f14243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho.l f14244f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f14245x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f14246y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ Object f14247z0;

    public /* synthetic */ s(int i10, org.jsoup.nodes.k kVar, Styling styling, HighlighterPosition highlighterPosition, Integer num, HighlighterData highlighterData, List list, t1.z zVar, boolean z6, ho.l lVar, ho.l lVar2, ho.l lVar3, int i11, int i12) {
        this.f14240b = i10;
        this.f14245x0 = kVar;
        this.f14246y0 = styling;
        this.f14247z0 = highlighterPosition;
        this.A0 = num;
        this.B0 = highlighterData;
        this.C0 = list;
        this.D0 = zVar;
        this.f14241c = z6;
        this.f14242d = lVar;
        this.f14243e = lVar2;
        this.f14244f = lVar3;
        this.Y = i11;
        this.Z = i12;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ListElement$lambda$1;
        sn.z AuthorProfileContent$lambda$4;
        switch (this.f14239a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ListElement$lambda$1 = HighlighterKt.ListElement$lambda$1(this.f14240b, (org.jsoup.nodes.k) this.f14245x0, (Styling) this.f14246y0, (HighlighterPosition) this.f14247z0, (Integer) this.A0, (HighlighterData) this.B0, (List) this.C0, (t1.z) this.D0, this.f14241c, this.f14242d, this.f14243e, this.f14244f, this.Y, this.Z, (u2.m) obj, intValue);
                return ListElement$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                AuthorProfileContent$lambda$4 = AuthorProfileScreenKt.AuthorProfileContent$lambda$4((AuthorProfile) this.f14245x0, (ua.b) this.f14246y0, this.f14240b, (String) this.f14247z0, (Map) this.A0, this.f14241c, this.f14242d, (ho.a) this.B0, this.f14243e, (ho.p) this.C0, this.f14244f, (ho.p) this.D0, this.Y, this.Z, (u2.m) obj, intValue2);
                return AuthorProfileContent$lambda$4;
        }
    }

    public /* synthetic */ s(AuthorProfile authorProfile, ua.b bVar, int i10, String str, Map map, boolean z6, ho.l lVar, ho.a aVar, ho.l lVar2, ho.p pVar, ho.l lVar3, ho.p pVar2, int i11, int i12) {
        this.f14245x0 = authorProfile;
        this.f14246y0 = bVar;
        this.f14240b = i10;
        this.f14247z0 = str;
        this.A0 = map;
        this.f14241c = z6;
        this.f14242d = lVar;
        this.B0 = aVar;
        this.f14243e = lVar2;
        this.C0 = pVar;
        this.f14244f = lVar3;
        this.D0 = pVar2;
        this.Y = i11;
        this.Z = i12;
    }
}
