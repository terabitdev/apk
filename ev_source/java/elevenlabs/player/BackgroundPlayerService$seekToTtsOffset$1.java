package io.elevenlabs.player;

import android.net.Uri;
import android.os.Bundle;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.l;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.player.PlayerSeekEmitter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import no.g;
import sn.z;
import tn.y;
import w7.m0;
import w7.r0;
import w7.u0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$seekToTtsOffset$1", f = "BackgroundPlayerService.kt", l = {676, 709, 723}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$seekToTtsOffset$1 extends i implements p {
    final /* synthetic */ l $getOffset;
    final /* synthetic */ boolean $playWhenReady;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$seekToTtsOffset$1$1", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.player.BackgroundPlayerService$seekToTtsOffset$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ r0 $newMediaItem;
        final /* synthetic */ boolean $playWhenReady;
        final /* synthetic */ ReadMeta $read;
        int label;
        final /* synthetic */ BackgroundPlayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BackgroundPlayerService backgroundPlayerService, r0 r0Var, boolean z6, ReadMeta readMeta, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = backgroundPlayerService;
            this.$newMediaItem = r0Var;
            this.$playWhenReady = z6;
            this.$read = readMeta;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$newMediaItem, this.$playWhenReady, this.$read, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            if (this.label == 0) {
                sn.a.g(obj);
                this.this$0.getPlayer().stop();
                g f02 = ae.l.f0(0, this.this$0.getPlayer().getMediaItemCount());
                BackgroundPlayerService backgroundPlayerService = this.this$0;
                ReadMeta readMeta = this.$read;
                Iterator it = f02.iterator();
                while (true) {
                    if (((no.f) it).f24561c) {
                        obj2 = ((y) it).next();
                        if (m.c(backgroundPlayerService.getPlayer().getMediaItemAt(((Number) obj2).intValue()).f36578a, readMeta.getReadId())) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                Integer num = (Integer) obj2;
                BackgroundPlayerService backgroundPlayerService2 = this.this$0;
                if (num != null) {
                    backgroundPlayerService2.getPlayer().replaceMediaItem(num.intValue(), this.$newMediaItem);
                    this.this$0.getPlayer().seekTo(num.intValue(), 0L);
                } else {
                    backgroundPlayerService2.getPlayer().setMediaItem(this.$newMediaItem);
                }
                this.this$0.getPlayer().prepare();
                this.this$0.getPlayer().setPlayWhenReady(this.$playWhenReady);
                return z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$seekToTtsOffset$1(BackgroundPlayerService backgroundPlayerService, l lVar, boolean z6, wn.c<? super BackgroundPlayerService$seekToTtsOffset$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
        this.$getOffset = lVar;
        this.$playWhenReady = z6;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        BackgroundPlayerService$seekToTtsOffset$1 backgroundPlayerService$seekToTtsOffset$1 = new BackgroundPlayerService$seekToTtsOffset$1(this.this$0, this.$getOffset, this.$playWhenReady, cVar);
        backgroundPlayerService$seekToTtsOffset$1.L$0 = obj;
        return backgroundPlayerService$seekToTtsOffset$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$seekToTtsOffset$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        if (r1 == r8) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x017e A[RETURN] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        String str;
        Object read;
        TtsAwareForwardingPlayer ttsAwareForwardingPlayer;
        String lastUsedVoiceId;
        Uri uri;
        long j4;
        u0 u0Var;
        Bundle bundle;
        PlayerSeekEmitter seekEmitter;
        d0 d0Var = (d0) this.L$0;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        sn.a.g(obj);
                        return zVar;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = this.J$0;
                sn.a.g(obj);
                seekEmitter = this.this$0.getSeekEmitter();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = j4;
                this.label = 3;
                if (seekEmitter.emit(j4, this) != aVar) {
                    return aVar;
                }
                return zVar;
            }
            r0 r0Var2 = (r0) this.L$1;
            sn.a.g(obj);
            r0Var = r0Var2;
            read = obj;
        } else {
            sn.a.g(obj);
            r0Var = (r0) this.this$0.currentMediaItem.getValue();
            if (r0Var == null || (str = r0Var.f36578a) == null) {
                str = this.this$0.currentReadId;
            }
            if (str != null) {
                ReadsService readsService = this.this$0.getReadsService();
                this.L$0 = d0Var;
                this.L$1 = r0Var;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = 0;
                this.label = 1;
                read = readsService.getRead(str, this);
            }
            BackgroundPlayerService backgroundPlayerService = this.this$0;
            backgroundPlayerService.getLogger().log(backgroundPlayerService.tag, "seekToTtsOffset: aborted, no currentMediaItem or read");
            return zVar;
        }
        ReadMeta readMeta = (ReadMeta) read;
        if (readMeta != null) {
            this.this$0.currentReadId = readMeta.getReadId();
            long p10 = ae.l.p(((Number) this.$getOffset.invoke(readMeta)).longValue(), new no.i(0L, readMeta.getCharCount()));
            ttsAwareForwardingPlayer = this.this$0.ttsAwarePlayer;
            if (ttsAwareForwardingPlayer != null) {
                ttsAwareForwardingPlayer.setCurrentCharOffset(p10);
                if (r0Var == null || (u0Var = r0Var.f36581d) == null || (bundle = u0Var.J) == null || (lastUsedVoiceId = ExchangeKt.getVoiceId(bundle)) == null) {
                    lastUsedVoiceId = readMeta.getLastUsedVoiceId();
                }
                r0 createMediaItem = this.this$0.getMediaItemCreator().createMediaItem(readMeta, lastUsedVoiceId, p10);
                Logger logger = this.this$0.getLogger();
                String str2 = this.this$0.tag;
                String readId = readMeta.getReadId();
                m0 m0Var = createMediaItem.f36579b;
                if (m0Var != null) {
                    uri = m0Var.f36469a;
                } else {
                    uri = null;
                }
                boolean z6 = this.$playWhenReady;
                StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("seekToTtsOffset: readId=", readId, p10, " / offset=");
                r10.append(" / voiceId=");
                r10.append(lastUsedVoiceId);
                r10.append(" / uri=");
                r10.append(uri);
                r10.append(" / playWhenReady=");
                r10.append(z6);
                logger.log(str2, r10.toString());
                fr.z main = this.this$0.getDispatcherFactory().getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, createMediaItem, this.$playWhenReady, readMeta, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = p10;
                this.label = 2;
                if (g0.Q(main, anonymousClass1, this) != aVar) {
                    j4 = p10;
                    seekEmitter = this.this$0.getSeekEmitter();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.J$0 = j4;
                    this.label = 3;
                    if (seekEmitter.emit(j4, this) != aVar) {
                    }
                }
                return aVar;
            }
            m.i("ttsAwarePlayer");
            throw null;
        }
        BackgroundPlayerService backgroundPlayerService2 = this.this$0;
        backgroundPlayerService2.getLogger().log(backgroundPlayerService2.tag, "seekToTtsOffset: aborted, no currentMediaItem or read");
        return zVar;
    }
}
