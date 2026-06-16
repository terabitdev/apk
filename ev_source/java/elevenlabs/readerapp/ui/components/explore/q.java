package io.elevenlabs.readerapp.ui.components.explore;

import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.FilterRowKt;
import io.elevenlabs.ui.components.ActionPillKt;
import io.elevenlabs.ui.components.SelectKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements ho.p {
    public final /* synthetic */ int Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14639c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f14640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f14641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14642f;

    public /* synthetic */ q(String str, t tVar, ho.a aVar, String str2, int i10, int i11) {
        this.f14637a = 3;
        this.f14638b = str;
        this.f14641e = tVar;
        this.f14640d = aVar;
        this.f14639c = str2;
        this.f14642f = i10;
        this.Y = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z ExploreSectionHeader$lambda$1;
        z FilterRow$lambda$1;
        z ActionPill$lambda$2;
        z Select$lambda$1;
        switch (this.f14637a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                String str = this.f14638b;
                t tVar = this.f14641e;
                ho.a aVar = this.f14640d;
                ExploreSectionHeader$lambda$1 = ExploreSectionHeaderKt.ExploreSectionHeader$lambda$1(str, tVar, this.f14639c, aVar, this.f14642f, this.Y, (u2.m) obj, intValue);
                return ExploreSectionHeader$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                String str2 = this.f14638b;
                t tVar2 = this.f14641e;
                ho.a aVar2 = this.f14640d;
                FilterRow$lambda$1 = FilterRowKt.FilterRow$lambda$1(str2, this.f14639c, aVar2, tVar2, this.f14642f, this.Y, (u2.m) obj, intValue2);
                return FilterRow$lambda$1;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                String str3 = this.f14638b;
                t tVar3 = this.f14641e;
                ho.a aVar3 = this.f14640d;
                ActionPill$lambda$2 = ActionPillKt.ActionPill$lambda$2(str3, this.f14639c, aVar3, tVar3, this.f14642f, this.Y, (u2.m) obj, intValue3);
                return ActionPill$lambda$2;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                Select$lambda$1 = SelectKt.Select$lambda$1(this.f14638b, this.f14641e, this.f14640d, this.f14639c, this.f14642f, this.Y, (u2.m) obj, intValue4);
                return Select$lambda$1;
        }
    }

    public /* synthetic */ q(String str, t tVar, String str2, ho.a aVar, int i10, int i11) {
        this.f14637a = 0;
        this.f14638b = str;
        this.f14641e = tVar;
        this.f14639c = str2;
        this.f14640d = aVar;
        this.f14642f = i10;
        this.Y = i11;
    }

    public /* synthetic */ q(String str, String str2, ho.a aVar, t tVar, int i10, int i11, int i12) {
        this.f14637a = i12;
        this.f14638b = str;
        this.f14639c = str2;
        this.f14640d = aVar;
        this.f14641e = tVar;
        this.f14642f = i10;
        this.Y = i11;
    }
}
