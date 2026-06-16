package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import ho.p;
import ho.q;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.echo.components.UpsellTitleKt;
import r1.s;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15097b;

    public /* synthetic */ b(String str, int i10) {
        this.f15096a = i10;
        this.f15097b = str;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z ChatInput$lambda$2$2;
        z HeaderActions$lambda$0;
        z UpsellTitle$lambda$2;
        switch (this.f15096a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                ChatInput$lambda$2$2 = ChatInputKt.ChatInput$lambda$2$2(this.f15097b, (p) obj, (m) obj2, intValue);
                return ChatInput$lambda$2$2;
            case 1:
                int intValue2 = ((Integer) obj3).intValue();
                HeaderActions$lambda$0 = HeaderActionsKt.HeaderActions$lambda$0(this.f15097b, (s) obj, (m) obj2, intValue2);
                return HeaderActions$lambda$0;
            default:
                int intValue3 = ((Integer) obj3).intValue();
                UpsellTitle$lambda$2 = UpsellTitleKt.UpsellTitle$lambda$2(this.f15097b, (String) obj, (m) obj2, intValue3);
                return UpsellTitle$lambda$2;
        }
    }
}
