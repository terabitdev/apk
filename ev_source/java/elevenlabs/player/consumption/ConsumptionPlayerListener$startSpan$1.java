package io.elevenlabs.player.consumption;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import ho.q;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.player.consumption.ConsumptionPlayerListener$startSpan$1", f = "ConsumptionPlayerListener.kt", l = {77}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ConsumptionPlayerListener$startSpan$1 extends i implements p {
    final /* synthetic */ boolean $online;
    final /* synthetic */ double $positionSeconds;
    final /* synthetic */ String $readId;
    final /* synthetic */ String $reason;
    final /* synthetic */ float $speed;
    final /* synthetic */ String $voiceId;
    final /* synthetic */ int $windowIndex;
    int label;
    final /* synthetic */ ConsumptionPlayerListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumptionPlayerListener$startSpan$1(ConsumptionPlayerListener consumptionPlayerListener, String str, int i10, double d10, String str2, boolean z6, float f10, String str3, c<? super ConsumptionPlayerListener$startSpan$1> cVar) {
        super(2, cVar);
        this.this$0 = consumptionPlayerListener;
        this.$readId = str;
        this.$windowIndex = i10;
        this.$positionSeconds = d10;
        this.$voiceId = str2;
        this.$online = z6;
        this.$speed = f10;
        this.$reason = str3;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new ConsumptionPlayerListener$startSpan$1(this.this$0, this.$readId, this.$windowIndex, this.$positionSeconds, this.$voiceId, this.$online, this.$speed, this.$reason, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((ConsumptionPlayerListener$startSpan$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        q qVar;
        ConsumptionCoordinator consumptionCoordinator;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            a.g(obj);
            qVar = this.this$0.chapterMetaResolver;
            String str = this.$readId;
            Integer num = new Integer(this.$windowIndex);
            this.label = 1;
            obj = qVar.invoke(str, num, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        ChapterMeta chapterMeta = (ChapterMeta) obj;
        z zVar = z.f31622a;
        if (chapterMeta != null) {
            consumptionCoordinator = this.this$0.consumption;
            consumptionCoordinator.startSpan(this.$readId, this.$positionSeconds, new SpanMeta(chapterMeta.getAudioFileNumber(), ConsumptionPlayerListenerKt.resolveEngineAudioType(chapterMeta.isReadMediaType(), this.$voiceId), chapterMeta.getPlaybackSource(), this.$online, this.$speed, this.$voiceId), this.$reason);
            return zVar;
        }
        return zVar;
    }
}
