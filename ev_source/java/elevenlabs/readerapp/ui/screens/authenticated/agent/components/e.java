package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import t1.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f15071b;

    public /* synthetic */ e(z zVar, int i10) {
        this.f15070a = i10;
        this.f15071b = zVar;
    }

    @Override // ho.a
    public final Object invoke() {
        boolean isAtBottom$lambda$0$0;
        switch (this.f15070a) {
            case 0:
                return Boolean.valueOf(AgentChatListKt$AgentChatList$1$1.d(this.f15071b));
            case 1:
                return Integer.valueOf(AgentChatListKt$AgentChatList$3$1.d(this.f15071b));
            default:
                isAtBottom$lambda$0$0 = AgentChatListKt.isAtBottom$lambda$0$0(this.f15071b);
                return Boolean.valueOf(isAtBottom$lambda$0$0);
        }
    }
}
