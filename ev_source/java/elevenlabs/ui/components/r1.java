package io.elevenlabs.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables.DetailsSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables.TitleDescriptionSectionKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17610c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3.t f17611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17613f;

    public /* synthetic */ r1(String str, String str2, i3.t tVar, int i10, int i11) {
        this.f17608a = 0;
        this.f17611d = tVar;
        this.f17609b = str;
        this.f17610c = str2;
        this.f17612e = i10;
        this.f17613f = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z StackedNotification$lambda$1;
        sn.z NotificationCard$lambda$2;
        sn.z DetailItem$lambda$1;
        sn.z TitleDescriptionSection$lambda$1;
        switch (this.f17608a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return NoResultsScreenKt.a(this.f17611d, this.f17609b, this.f17610c, this.f17612e, this.f17613f, (u2.m) obj, intValue);
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                i3.t tVar = this.f17611d;
                StackedNotification$lambda$1 = StackedNotificationKt.StackedNotification$lambda$1(this.f17609b, this.f17610c, tVar, this.f17612e, this.f17613f, (u2.m) obj, intValue2);
                return StackedNotification$lambda$1;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                i3.t tVar2 = this.f17611d;
                NotificationCard$lambda$2 = StackedNotificationKt.NotificationCard$lambda$2(this.f17609b, this.f17610c, tVar2, this.f17612e, this.f17613f, (u2.m) obj, intValue3);
                return NotificationCard$lambda$2;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                i3.t tVar3 = this.f17611d;
                DetailItem$lambda$1 = DetailsSectionKt.DetailItem$lambda$1(this.f17609b, this.f17610c, tVar3, this.f17612e, this.f17613f, (u2.m) obj, intValue4);
                return DetailItem$lambda$1;
            default:
                int intValue5 = ((Integer) obj2).intValue();
                i3.t tVar4 = this.f17611d;
                TitleDescriptionSection$lambda$1 = TitleDescriptionSectionKt.TitleDescriptionSection$lambda$1(this.f17609b, this.f17610c, tVar4, this.f17612e, this.f17613f, (u2.m) obj, intValue5);
                return TitleDescriptionSection$lambda$1;
        }
    }

    public /* synthetic */ r1(String str, String str2, i3.t tVar, int i10, int i11, int i12) {
        this.f17608a = i12;
        this.f17609b = str;
        this.f17610c = str2;
        this.f17611d = tVar;
        this.f17612e = i10;
        this.f17613f = i11;
    }
}
