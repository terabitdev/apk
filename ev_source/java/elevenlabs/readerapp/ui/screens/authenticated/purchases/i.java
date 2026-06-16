package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.model.BookRefundReason;
import r1.z1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16655b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16656c;

    public /* synthetic */ i(BookRefundState bookRefundState, ho.l lVar) {
        this.f16654a = 0;
        this.f16655b = bookRefundState;
        this.f16656c = lVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z BookRefundScreenUI$lambda$3;
        sn.z BookRefundScreenUI$lambda$3$0$10$1$1$1;
        sn.z ReferFriendScreenUI$lambda$3;
        switch (this.f16654a) {
            case 0:
                BookRefundScreenUI$lambda$3 = BookRefundScreenKt.BookRefundScreenUI$lambda$3((BookRefundState) this.f16655b, (ho.l) this.f16656c, (z1) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return BookRefundScreenUI$lambda$3;
            case 1:
                BookRefundScreenUI$lambda$3$0$10$1$1$1 = BookRefundScreenKt.BookRefundScreenUI$lambda$3$0$10$1$1$1((BookRefundReason) this.f16656c, (BookRefundState) this.f16655b, (r1.s) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return BookRefundScreenUI$lambda$3$0$10$1$1$1;
            default:
                ReferFriendScreenUI$lambda$3 = ReferFriendScreenKt.ReferFriendScreenUI$lambda$3((ho.l) this.f16656c, (ReferFriendState) this.f16655b, (z1) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ReferFriendScreenUI$lambda$3;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i10) {
        this.f16654a = i10;
        this.f16656c = obj;
        this.f16655b = obj2;
    }
}
