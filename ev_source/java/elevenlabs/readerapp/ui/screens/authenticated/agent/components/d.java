package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatHistoryListKt;
import java.util.List;
import sn.z;
import t1.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15067a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f15069c;

    public /* synthetic */ d(List list, boolean z6) {
        this.f15069c = list;
        this.f15068b = z6;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z AgentChatList$lambda$6$0;
        z ChatHistoryList$lambda$1$0;
        switch (this.f15067a) {
            case 0:
                AgentChatList$lambda$6$0 = AgentChatListKt.AgentChatList$lambda$6$0(this.f15069c, this.f15068b, (t) obj);
                return AgentChatList$lambda$6$0;
            default:
                ChatHistoryList$lambda$1$0 = ChatHistoryListKt.ChatHistoryList$lambda$1$0(this.f15068b, this.f15069c, (t) obj);
                return ChatHistoryList$lambda$1$0;
        }
    }

    public /* synthetic */ d(boolean z6, List list) {
        this.f15068b = z6;
        this.f15069c = list;
    }
}
