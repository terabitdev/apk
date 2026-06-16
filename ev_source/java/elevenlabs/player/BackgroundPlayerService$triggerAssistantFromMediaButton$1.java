package io.elevenlabs.player;

import android.content.Intent;
import android.os.Bundle;
import androidx.room.m0;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.player.TriggerAssistantFromMediaButtonUseCase;
import kotlin.Metadata;
import sn.z;
import w7.h1;
import w7.r0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$triggerAssistantFromMediaButton$1", f = "BackgroundPlayerService.kt", l = {742}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$triggerAssistantFromMediaButton$1 extends i implements p {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$triggerAssistantFromMediaButton$1(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$triggerAssistantFromMediaButton$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    public static final String invokeSuspend$lambda$0(String str, boolean z6) {
        String buildPlayerDeepLink;
        buildPlayerDeepLink = BackgroundPlayerService.INSTANCE.buildPlayerDeepLink(str, Analytics.Event.PlayerActivationSource.MediaButton, z6);
        return buildPlayerDeepLink;
    }

    public static final z invokeSuspend$lambda$1(BackgroundPlayerService backgroundPlayerService, Intent intent) {
        intent.setClass(backgroundPlayerService, m0.H(backgroundPlayerService.getPlayerConfiguration().getActivityClass()));
        backgroundPlayerService.startActivity(intent);
        return z.f31622a;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$triggerAssistantFromMediaButton$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$triggerAssistantFromMediaButton$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        String str;
        BackgroundPlayerService backgroundPlayerService;
        TriggerAssistantFromMediaButtonUseCase.AssistantState assistantState;
        Object invoke;
        int i10 = this.label;
        z zVar = z.f31622a;
        if (i10 != 0) {
            if (i10 == 1) {
                BackgroundPlayerService backgroundPlayerService2 = (BackgroundPlayerService) this.L$3;
                sn.a.g(obj);
                backgroundPlayerService = backgroundPlayerService2;
                invoke = obj;
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            r0 r0Var = (r0) this.this$0.currentMediaItem.getValue();
            if (r0Var == null) {
                Logger.logWarning$default(this.this$0.getLogger(), this.this$0.tag, "Cannot trigger assistant: no current media item", null, 4, null);
                return zVar;
            }
            String str2 = r0Var.f36578a;
            str2.getClass();
            Bundle bundle = r0Var.f36581d.J;
            if (bundle != null) {
                str = ExchangeKt.getVoiceId(bundle);
            } else {
                str = null;
            }
            backgroundPlayerService = this.this$0;
            String str3 = str;
            TriggerAssistantFromMediaButtonUseCase triggerAssistantFromMediaButtonUseCase = backgroundPlayerService.getTriggerAssistantFromMediaButtonUseCase();
            h1 player = this.this$0.getPlayer();
            assistantState = this.this$0.assistantState;
            c cVar = new c(1);
            e eVar = new e(this.this$0, 0);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = backgroundPlayerService;
            this.label = 1;
            invoke = triggerAssistantFromMediaButtonUseCase.invoke(str2, str3, player, assistantState, cVar, eVar, this);
            xn.a aVar = xn.a.f37986a;
            if (invoke == aVar) {
                return aVar;
            }
        }
        backgroundPlayerService.assistantState = (TriggerAssistantFromMediaButtonUseCase.AssistantState) invoke;
        return zVar;
    }
}
