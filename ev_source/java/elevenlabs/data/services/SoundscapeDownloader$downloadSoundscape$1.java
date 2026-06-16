package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.domain.services.SoundscapeDownloadState;
import java.io.File;
import kotlin.Metadata;
import sn.m;
import sn.z;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.SoundscapeDownloader$downloadSoundscape$1", f = "SoundscapeDownloader.kt", l = {71, 75, 77, 83, 84}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/services/SoundscapeDownloadState;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class SoundscapeDownloader$downloadSoundscape$1 extends yn.i implements p {
    final /* synthetic */ Soundscape $soundscape;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SoundscapeDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundscapeDownloader$downloadSoundscape$1(SoundscapeDownloader soundscapeDownloader, Soundscape soundscape, wn.c<? super SoundscapeDownloader$downloadSoundscape$1> cVar) {
        super(2, cVar);
        this.this$0 = soundscapeDownloader;
        this.$soundscape = soundscape;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        SoundscapeDownloader$downloadSoundscape$1 soundscapeDownloader$downloadSoundscape$1 = new SoundscapeDownloader$downloadSoundscape$1(this.this$0, this.$soundscape, cVar);
        soundscapeDownloader$downloadSoundscape$1.L$0 = obj;
        return soundscapeDownloader$downloadSoundscape$1;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((SoundscapeDownloader$downloadSoundscape$1) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
    
        if (r0 == r11) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f8 A[RETURN] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Soundscape.AudioFile preferredAudioFile;
        File cacheFileFor;
        Soundscape.AudioFile audioFile;
        File file;
        Object m947downloadSoundscapeyxL6bBk;
        ir.j jVar = (ir.j) this.L$0;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                            } else {
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                    } else {
                        sn.a.g(obj);
                        m947downloadSoundscapeyxL6bBk = ((m) obj).f31603a;
                        Throwable a10 = m.a(m947downloadSoundscapeyxL6bBk);
                        if (a10 == null) {
                            SoundscapeDownloadState.Completed completed = new SoundscapeDownloadState.Completed((File) m947downloadSoundscapeyxL6bBk);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.I$0 = 0;
                            this.label = 4;
                            if (jVar.emit(completed, this) == aVar) {
                                return aVar;
                            }
                            return zVar;
                        }
                        String message = a10.getMessage();
                        if (message == null) {
                            message = "Unknown error";
                        }
                        SoundscapeDownloadState.Error error = new SoundscapeDownloadState.Error(message);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.I$0 = 0;
                        this.label = 5;
                        if (jVar.emit(error, this) == aVar) {
                        }
                    }
                } else {
                    File file2 = (File) this.L$2;
                    audioFile = (Soundscape.AudioFile) this.L$1;
                    sn.a.g(obj);
                    file = file2;
                }
            }
            sn.a.g(obj);
            return zVar;
        }
        sn.a.g(obj);
        preferredAudioFile = this.this$0.getPreferredAudioFile(this.$soundscape);
        cacheFileFor = this.this$0.cacheFileFor(this.$soundscape, preferredAudioFile);
        if (cacheFileFor.exists()) {
            SoundscapeDownloadState.Completed completed2 = new SoundscapeDownloadState.Completed(cacheFileFor);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (jVar.emit(completed2, this) == aVar) {
            }
        } else {
            SoundscapeDownloadState.Downloading downloading = new SoundscapeDownloadState.Downloading(u.P);
            this.L$0 = jVar;
            this.L$1 = preferredAudioFile;
            this.L$2 = cacheFileFor;
            this.label = 2;
            if (jVar.emit(downloading, this) != aVar) {
                audioFile = preferredAudioFile;
                file = cacheFileFor;
            }
        }
        return aVar;
        SoundscapeDownloader soundscapeDownloader = this.this$0;
        Soundscape soundscape = this.$soundscape;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(jVar, null);
        this.L$0 = jVar;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 3;
        m947downloadSoundscapeyxL6bBk = soundscapeDownloader.m947downloadSoundscapeyxL6bBk(soundscape, audioFile, file, anonymousClass1, this);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.data.services.SoundscapeDownloader$downloadSoundscape$1$1", f = "SoundscapeDownloader.kt", l = {81}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "progress", "Lsn/z;", "<anonymous>", "(F)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.data.services.SoundscapeDownloader$downloadSoundscape$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        final /* synthetic */ ir.j $$this$flow;
        /* synthetic */ float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ir.j jVar, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$$this$flow = jVar;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$flow, cVar);
            anonymousClass1.F$0 = ((Number) obj).floatValue();
            return anonymousClass1;
        }

        public final Object invoke(float f10, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(Float.valueOf(f10), cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            float f10 = this.F$0;
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
                ir.j jVar = this.$$this$flow;
                SoundscapeDownloadState.Downloading downloading = new SoundscapeDownloadState.Downloading(f10);
                this.F$0 = f10;
                this.label = 1;
                Object emit = jVar.emit(downloading, this);
                xn.a aVar = xn.a.f37986a;
                if (emit == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        @Override // ho.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).floatValue(), (wn.c<? super z>) obj2);
        }
    }
}
