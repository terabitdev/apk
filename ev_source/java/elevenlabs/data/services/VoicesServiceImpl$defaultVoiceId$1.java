package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.domain.model.AppConfig;
import io.elevenlabs.domain.services.AppConfigService;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.VoicesServiceImpl$defaultVoiceId$1", f = "VoicesServiceImpl.kt", l = {83}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroid/content/SharedPreferences;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoicesServiceImpl$defaultVoiceId$1 extends yn.i implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VoicesServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicesServiceImpl$defaultVoiceId$1(VoicesServiceImpl voicesServiceImpl, wn.c<? super VoicesServiceImpl$defaultVoiceId$1> cVar) {
        super(2, cVar);
        this.this$0 = voicesServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        VoicesServiceImpl$defaultVoiceId$1 voicesServiceImpl$defaultVoiceId$1 = new VoicesServiceImpl$defaultVoiceId$1(this.this$0, cVar);
        voicesServiceImpl$defaultVoiceId$1.L$0 = obj;
        return voicesServiceImpl$defaultVoiceId$1;
    }

    @Override // ho.p
    public final Object invoke(SharedPreferences sharedPreferences, wn.c<? super String> cVar) {
        return ((VoicesServiceImpl$defaultVoiceId$1) create(sharedPreferences, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        String str;
        AppConfigService appConfigService;
        SharedPreferences sharedPreferences = (SharedPreferences) this.L$0;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            str = this.this$0.prefDefaultVoiceId;
            String string = sharedPreferences.getString(str, null);
            if (string == null) {
                appConfigService = this.this$0.appConfigService;
                ir.i config = appConfigService.getConfig();
                this.L$0 = null;
                this.label = 1;
                obj = r.u(config, this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                return string;
            }
        }
        return ((AppConfig) obj).getDefaultVoice();
    }
}
