package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentMessageRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatMessageBubbleKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeWarningSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.GeneratingStepKt;
import io.elevenlabs.ui.components.EmptyScreenKt;
import io.elevenlabs.ui.components.PillSmallKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3.t f14767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14769e;

    public /* synthetic */ r(i3.t tVar, String str, int i10, int i11, int i12) {
        this.f14765a = i12;
        this.f14767c = tVar;
        this.f14766b = str;
        this.f14768d = i10;
        this.f14769e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ExpiryBadge$lambda$1;
        sn.z UserMessageRow$lambda$1;
        sn.z AgentMessageBubble$lambda$1;
        sn.z AssistantMessageBubble$lambda$1;
        sn.z UserMessageBubble$lambda$1;
        sn.z HomeWarningSectionV4$lambda$1;
        sn.z GeneratingStep$lambda$2;
        sn.z EmptyScreen$lambda$1;
        sn.z PillSmall$lambda$1;
        switch (this.f14765a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                int i10 = this.f14768d;
                ExpiryBadge$lambda$1 = ExpiryBadgeKt.ExpiryBadge$lambda$1(this.f14766b, this.f14767c, i10, this.f14769e, (u2.m) obj, intValue);
                return ExpiryBadge$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                int i11 = this.f14768d;
                UserMessageRow$lambda$1 = AgentMessageRowKt.UserMessageRow$lambda$1(this.f14766b, this.f14767c, i11, this.f14769e, (u2.m) obj, intValue2);
                return UserMessageRow$lambda$1;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                int i12 = this.f14768d;
                AgentMessageBubble$lambda$1 = AgentMessageRowKt.AgentMessageBubble$lambda$1(this.f14766b, this.f14767c, i12, this.f14769e, (u2.m) obj, intValue3);
                return AgentMessageBubble$lambda$1;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                int i13 = this.f14768d;
                AssistantMessageBubble$lambda$1 = ChatMessageBubbleKt.AssistantMessageBubble$lambda$1(this.f14766b, this.f14767c, i13, this.f14769e, (u2.m) obj, intValue4);
                return AssistantMessageBubble$lambda$1;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                int i14 = this.f14768d;
                UserMessageBubble$lambda$1 = ChatMessageBubbleKt.UserMessageBubble$lambda$1(this.f14766b, this.f14767c, i14, this.f14769e, (u2.m) obj, intValue5);
                return UserMessageBubble$lambda$1;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                int i15 = this.f14768d;
                HomeWarningSectionV4$lambda$1 = HomeWarningSectionKt.HomeWarningSectionV4$lambda$1(this.f14766b, this.f14767c, i15, this.f14769e, (u2.m) obj, intValue6);
                return HomeWarningSectionV4$lambda$1;
            case 6:
                int intValue7 = ((Integer) obj2).intValue();
                int i16 = this.f14768d;
                String str = this.f14766b;
                GeneratingStep$lambda$2 = GeneratingStepKt.GeneratingStep$lambda$2(this.f14767c, str, i16, this.f14769e, (u2.m) obj, intValue7);
                return GeneratingStep$lambda$2;
            case 7:
                int intValue8 = ((Integer) obj2).intValue();
                int i17 = this.f14768d;
                String str2 = this.f14766b;
                EmptyScreen$lambda$1 = EmptyScreenKt.EmptyScreen$lambda$1(this.f14767c, str2, i17, this.f14769e, (u2.m) obj, intValue8);
                return EmptyScreen$lambda$1;
            default:
                int intValue9 = ((Integer) obj2).intValue();
                int i18 = this.f14768d;
                PillSmall$lambda$1 = PillSmallKt.PillSmall$lambda$1(this.f14766b, this.f14767c, i18, this.f14769e, (u2.m) obj, intValue9);
                return PillSmall$lambda$1;
        }
    }

    public /* synthetic */ r(String str, i3.t tVar, int i10, int i11, int i12) {
        this.f14765a = i12;
        this.f14766b = str;
        this.f14767c = tVar;
        this.f14768d = i10;
        this.f14769e = i11;
    }
}
