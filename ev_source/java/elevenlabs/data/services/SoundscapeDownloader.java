package io.elevenlabs.data.services;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import androidx.room.m0;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.protobuf.c6;
import fr.r0;
import ho.p;
import io.elevenlabs.domain.model.Soundscape;
import ir.m1;
import ir.r;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import sn.m;
import sn.o;
import sn.z;
import t2.u;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JT\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000e2$\u0010\u0018\u001a \b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJN\u0010#\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2$\u0010\u0018\u001a \b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010+J\u0017\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b,\u0010\u0012J\u0015\u0010.\u001a\u00020-2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u001b\u00106\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lio/elevenlabs/data/services/SoundscapeDownloader;", "", "Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "okHttpClient", "<init>", "(Landroid/content/Context;Lokhttp3/OkHttpClient;)V", "Lio/elevenlabs/domain/model/Soundscape;", "soundscape", "Lio/elevenlabs/domain/model/Soundscape$AudioFile;", "getPreferredAudioFile", "(Lio/elevenlabs/domain/model/Soundscape;)Lio/elevenlabs/domain/model/Soundscape$AudioFile;", "audioFile", "Ljava/io/File;", "cacheFileFor", "(Lio/elevenlabs/domain/model/Soundscape;Lio/elevenlabs/domain/model/Soundscape$AudioFile;)Ljava/io/File;", "tempFileFor", "(Lio/elevenlabs/domain/model/Soundscape;)Ljava/io/File;", "cachedFile", "Lkotlin/Function2;", "", "Lwn/c;", "Lsn/z;", "onProgress", "Lsn/m;", "downloadSoundscape-yxL6bBk", "(Lio/elevenlabs/domain/model/Soundscape;Lio/elevenlabs/domain/model/Soundscape$AudioFile;Ljava/io/File;Lho/p;Lwn/c;)Ljava/lang/Object;", "downloadSoundscape", "Ljava/io/InputStream;", "input", "Ljava/io/OutputStream;", "output", "", "contentLength", "copyStreamWithProgress", "(Ljava/io/InputStream;Ljava/io/OutputStream;JLho/p;Lwn/c;)Ljava/lang/Object;", "file", "", "calculateSHA256Checksum", "(Ljava/io/File;)Ljava/lang/String;", "Lir/i;", "Lio/elevenlabs/domain/services/SoundscapeDownloadState;", "(Lio/elevenlabs/domain/model/Soundscape;)Lir/i;", "getCachedFile", "", "isCached", "(Lio/elevenlabs/domain/model/Soundscape;)Z", "Landroid/content/Context;", "Lokhttp3/OkHttpClient;", "authlessClient$delegate", "Lsn/h;", "getAuthlessClient", "()Lokhttp3/OkHttpClient;", "authlessClient", "getSoundscapesCacheDir", "()Ljava/io/File;", "soundscapesCacheDir", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SoundscapeDownloader {
    private static final int BUFFER_SIZE = 8192;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String SOUNDSCAPES_DIR = "soundscapes";

    /* renamed from: authlessClient$delegate, reason: from kotlin metadata */
    private final sn.h authlessClient;
    private final Context context;
    private final OkHttpClient okHttpClient;

    public SoundscapeDownloader(Context context, OkHttpClient okHttpClient) {
        context.getClass();
        okHttpClient.getClass();
        this.context = context;
        this.okHttpClient = okHttpClient;
        this.authlessClient = new o(new f(this, 3));
    }

    public static final OkHttpClient authlessClient_delegate$lambda$0(SoundscapeDownloader soundscapeDownloader) {
        OkHttpClient.Builder c5 = soundscapeDownloader.okHttpClient.c();
        c5.f25369d.add(new Interceptor() { // from class: io.elevenlabs.data.services.SoundscapeDownloader$authlessClient_delegate$lambda$0$$inlined$-addNetworkInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                chain.getClass();
                Request.Builder b10 = chain.request().b();
                b10.f25407c.f(SIPHeaderNames.AUTHORIZATION);
                return chain.a(new Request(b10));
            }
        });
        return new OkHttpClient(c5);
    }

    public static /* synthetic */ CharSequence b(byte b10) {
        return calculateSHA256Checksum$lambda$1(b10);
    }

    public final File cacheFileFor(Soundscape soundscape, Soundscape.AudioFile audioFile) {
        return new File(getSoundscapesCacheDir(), defpackage.f.j(soundscape.getId(), Separators.DOT, audioFile.getFileExtension()));
    }

    private final String calculateSHA256Checksum(File file) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    byte[] digest = messageDigest.digest();
                    digest.getClass();
                    return n.J0(32, tn.n.P0(digest, "", new h(5), 30));
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                m0.o(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final CharSequence calculateSHA256Checksum$lambda$1(byte b10) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0081 -> B:10:0x00af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x008d -> B:10:0x00af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ac -> B:10:0x00af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copyStreamWithProgress(InputStream inputStream, OutputStream outputStream, long j4, p pVar, wn.c<? super z> cVar) {
        SoundscapeDownloader$copyStreamWithProgress$1 soundscapeDownloader$copyStreamWithProgress$1;
        int i10;
        long j10;
        byte[] bArr;
        SoundscapeDownloader$copyStreamWithProgress$1 soundscapeDownloader$copyStreamWithProgress$12;
        b0 obj;
        long j11;
        InputStream inputStream2;
        OutputStream outputStream2;
        p pVar2;
        int read;
        if (cVar instanceof SoundscapeDownloader$copyStreamWithProgress$1) {
            soundscapeDownloader$copyStreamWithProgress$1 = (SoundscapeDownloader$copyStreamWithProgress$1) cVar;
            int i11 = soundscapeDownloader$copyStreamWithProgress$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                soundscapeDownloader$copyStreamWithProgress$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = soundscapeDownloader$copyStreamWithProgress$1.result;
                i10 = soundscapeDownloader$copyStreamWithProgress$1.label;
                long j12 = 0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        long j13 = soundscapeDownloader$copyStreamWithProgress$1.J$1;
                        long j14 = soundscapeDownloader$copyStreamWithProgress$1.J$0;
                        b0 b0Var = (b0) soundscapeDownloader$copyStreamWithProgress$1.L$4;
                        bArr = (byte[]) soundscapeDownloader$copyStreamWithProgress$1.L$3;
                        p pVar3 = (p) soundscapeDownloader$copyStreamWithProgress$1.L$2;
                        OutputStream outputStream3 = (OutputStream) soundscapeDownloader$copyStreamWithProgress$1.L$1;
                        InputStream inputStream3 = (InputStream) soundscapeDownloader$copyStreamWithProgress$1.L$0;
                        sn.a.g(obj2);
                        inputStream2 = inputStream3;
                        soundscapeDownloader$copyStreamWithProgress$12 = soundscapeDownloader$copyStreamWithProgress$1;
                        b0 b0Var2 = b0Var;
                        pVar2 = pVar3;
                        outputStream2 = outputStream3;
                        j11 = j13;
                        j10 = j14;
                        j12 = 0;
                        obj = b0Var2;
                        read = inputStream2.read(bArr);
                        obj.f20557a = read;
                        if (read != -1) {
                            outputStream2.write(bArr, 0, read);
                            j11 += obj.f20557a;
                            b0Var2 = obj;
                            if (j10 > j12) {
                                float l4 = ae.l.l(((float) j11) / ((float) j10), u.P, 1.0f);
                                b0Var2 = obj;
                                if (pVar2 != null) {
                                    Float f10 = new Float(l4);
                                    soundscapeDownloader$copyStreamWithProgress$12.L$0 = inputStream2;
                                    soundscapeDownloader$copyStreamWithProgress$12.L$1 = outputStream2;
                                    soundscapeDownloader$copyStreamWithProgress$12.L$2 = pVar2;
                                    soundscapeDownloader$copyStreamWithProgress$12.L$3 = bArr;
                                    soundscapeDownloader$copyStreamWithProgress$12.L$4 = obj;
                                    soundscapeDownloader$copyStreamWithProgress$12.J$0 = j10;
                                    soundscapeDownloader$copyStreamWithProgress$12.J$1 = j11;
                                    soundscapeDownloader$copyStreamWithProgress$12.F$0 = l4;
                                    soundscapeDownloader$copyStreamWithProgress$12.label = 1;
                                    Object invoke = pVar2.invoke(f10, soundscapeDownloader$copyStreamWithProgress$12);
                                    xn.a aVar = xn.a.f37986a;
                                    b0Var2 = obj;
                                    if (invoke == aVar) {
                                        return aVar;
                                    }
                                }
                            }
                            j12 = 0;
                            obj = b0Var2;
                            read = inputStream2.read(bArr);
                            obj.f20557a = read;
                            if (read != -1) {
                                return z.f31622a;
                            }
                        }
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj2);
                    j10 = j4;
                    bArr = new byte[8192];
                    soundscapeDownloader$copyStreamWithProgress$12 = soundscapeDownloader$copyStreamWithProgress$1;
                    obj = new Object();
                    j11 = 0;
                    inputStream2 = inputStream;
                    outputStream2 = outputStream;
                    pVar2 = pVar;
                    read = inputStream2.read(bArr);
                    obj.f20557a = read;
                    if (read != -1) {
                    }
                }
            }
        }
        soundscapeDownloader$copyStreamWithProgress$1 = new SoundscapeDownloader$copyStreamWithProgress$1(this, cVar);
        Object obj22 = soundscapeDownloader$copyStreamWithProgress$1.result;
        i10 = soundscapeDownloader$copyStreamWithProgress$1.label;
        long j122 = 0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c7  */
    /* JADX WARN: Type inference failed for: r1v5, types: [sn.l] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: downloadSoundscape-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m947downloadSoundscapeyxL6bBk(Soundscape soundscape, Soundscape.AudioFile audioFile, File file, p pVar, wn.c<? super m> cVar) {
        SoundscapeDownloader$downloadSoundscape$2 soundscapeDownloader$downloadSoundscape$2;
        Throwable th;
        ?? r62;
        Throwable th2;
        InputStream inputStream;
        Response response;
        File file2;
        File file3;
        File lVar;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        Closeable closeable;
        Throwable th3;
        InputStream inputStream3;
        SoundscapeDownloader soundscapeDownloader;
        File file4;
        Response response2;
        Soundscape.AudioFile audioFile2;
        String calculateSHA256Checksum;
        int i10;
        if ((cVar instanceof SoundscapeDownloader$downloadSoundscape$2) && (r62 = (i10 = (soundscapeDownloader$downloadSoundscape$2 = (SoundscapeDownloader$downloadSoundscape$2) cVar).label) & Integer.MIN_VALUE) != 0) {
            soundscapeDownloader$downloadSoundscape$2.label = i10 - Integer.MIN_VALUE;
        } else {
            soundscapeDownloader$downloadSoundscape$2 = new SoundscapeDownloader$downloadSoundscape$2(this, cVar);
        }
        SoundscapeDownloader$downloadSoundscape$2 soundscapeDownloader$downloadSoundscape$22 = soundscapeDownloader$downloadSoundscape$2;
        Object obj = soundscapeDownloader$downloadSoundscape$22.result;
        ?? r32 = soundscapeDownloader$downloadSoundscape$22.label;
        ?? r42 = 1;
        try {
            try {
                try {
                    if (r32 != 0) {
                        if (r32 == 1) {
                            closeable = (Closeable) soundscapeDownloader$downloadSoundscape$22.L$12;
                            ?? r33 = (Closeable) soundscapeDownloader$downloadSoundscape$22.L$10;
                            ?? r43 = (Closeable) soundscapeDownloader$downloadSoundscape$22.L$7;
                            SoundscapeDownloader soundscapeDownloader2 = (SoundscapeDownloader) soundscapeDownloader$downloadSoundscape$22.L$5;
                            File file5 = (File) soundscapeDownloader$downloadSoundscape$22.L$4;
                            lVar = (File) soundscapeDownloader$downloadSoundscape$22.L$2;
                            audioFile2 = (Soundscape.AudioFile) soundscapeDownloader$downloadSoundscape$22.L$1;
                            try {
                                sn.a.g(obj);
                                soundscapeDownloader = soundscapeDownloader2;
                                inputStream3 = r33;
                                response2 = r43;
                                file4 = file5;
                            } catch (Throwable th4) {
                                th3 = th4;
                                r32 = r33;
                                r42 = r43;
                                r62 = file5;
                                try {
                                    throw th3;
                                } finally {
                                }
                            }
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        file2 = tempFileFor(soundscape);
                        if (file2.exists() && !file2.delete()) {
                            return new sn.l(new IOException("Failed to clear previous temp file"));
                        }
                        Request.Builder builder = new Request.Builder();
                        builder.f(audioFile.getRemoteUrl());
                        Request request = new Request(builder);
                        OkHttpClient authlessClient = getAuthlessClient();
                        authlessClient.getClass();
                        response = FirebasePerfOkHttpClient.execute(new RealCall(authlessClient, request, false));
                        if (response.F0) {
                            ResponseBody responseBody = response.Y;
                            if (responseBody != null) {
                                long f25454d = responseBody.getF25454d();
                                inputStream = responseBody.a();
                                try {
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                                    try {
                                        soundscapeDownloader$downloadSoundscape$22.L$0 = null;
                                        soundscapeDownloader$downloadSoundscape$22.L$1 = audioFile;
                                        soundscapeDownloader$downloadSoundscape$22.L$2 = file;
                                        soundscapeDownloader$downloadSoundscape$22.L$3 = null;
                                        soundscapeDownloader$downloadSoundscape$22.L$4 = file2;
                                        soundscapeDownloader$downloadSoundscape$22.L$5 = this;
                                        soundscapeDownloader$downloadSoundscape$22.L$6 = null;
                                        soundscapeDownloader$downloadSoundscape$22.L$7 = response;
                                        soundscapeDownloader$downloadSoundscape$22.L$8 = null;
                                        soundscapeDownloader$downloadSoundscape$22.L$9 = null;
                                        soundscapeDownloader$downloadSoundscape$22.L$10 = inputStream;
                                        soundscapeDownloader$downloadSoundscape$22.L$11 = null;
                                        soundscapeDownloader$downloadSoundscape$22.L$12 = fileOutputStream2;
                                        soundscapeDownloader$downloadSoundscape$22.L$13 = null;
                                        soundscapeDownloader$downloadSoundscape$22.I$0 = 0;
                                        soundscapeDownloader$downloadSoundscape$22.I$1 = 0;
                                        soundscapeDownloader$downloadSoundscape$22.J$0 = f25454d;
                                        soundscapeDownloader$downloadSoundscape$22.I$2 = 0;
                                        soundscapeDownloader$downloadSoundscape$22.I$3 = 0;
                                        soundscapeDownloader$downloadSoundscape$22.label = 1;
                                        inputStream2 = inputStream;
                                        fileOutputStream = fileOutputStream2;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        inputStream2 = inputStream;
                                        fileOutputStream = fileOutputStream2;
                                    }
                                    try {
                                        Object copyStreamWithProgress = copyStreamWithProgress(inputStream2, fileOutputStream, f25454d, pVar, soundscapeDownloader$downloadSoundscape$22);
                                        xn.a aVar = xn.a.f37986a;
                                        if (copyStreamWithProgress == aVar) {
                                            return aVar;
                                        }
                                        inputStream3 = inputStream2;
                                        closeable = fileOutputStream;
                                        soundscapeDownloader = this;
                                        file4 = file2;
                                        response2 = response;
                                        lVar = file;
                                        audioFile2 = audioFile;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        FileOutputStream fileOutputStream3 = fileOutputStream;
                                        r32 = inputStream2;
                                        closeable = fileOutputStream3;
                                        th3 = th;
                                        r62 = file2;
                                        r42 = response;
                                        throw th3;
                                    }
                                } catch (Throwable th7) {
                                    th2 = th7;
                                    try {
                                        throw th2;
                                    } finally {
                                    }
                                }
                            } else {
                                throw new IOException("Empty response body");
                            }
                        } else {
                            throw new IOException("Failed to download soundscape: HTTP " + response.f25426d);
                        }
                    }
                    m0.o(closeable, null);
                } catch (Throwable th8) {
                    th2 = th8;
                    inputStream = r32;
                    response = r42;
                    file2 = r62;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            file3 = file2;
            lVar = new sn.l(th);
            if (m.a(lVar) != null) {
                file3.delete();
            }
            return lVar;
        }
        try {
            m0.o(inputStream3, null);
            try {
                m0.o(response2, null);
                calculateSHA256Checksum = soundscapeDownloader.calculateSHA256Checksum(file4);
            } catch (Throwable th11) {
                th = th11;
                file2 = file4;
                file3 = file2;
                lVar = new sn.l(th);
                if (m.a(lVar) != null) {
                }
                return lVar;
            }
            if (kotlin.jvm.internal.m.c(calculateSHA256Checksum, audioFile2.getChecksum())) {
                if (lVar.exists() && !lVar.delete()) {
                    throw new IOException("Failed to replace existing cached file");
                }
                if (!file4.renameTo(lVar)) {
                    throw new IOException("Failed to move downloaded file");
                }
                file3 = file4;
                if (m.a(lVar) != null && file3.exists()) {
                    file3.delete();
                }
                return lVar;
            }
            throw new IOException("Checksum mismatch. Expected: " + audioFile2.getChecksum() + ", Got: " + calculateSHA256Checksum);
        } catch (Throwable th12) {
            th = th12;
            response = response2;
            file2 = file4;
            try {
                throw th;
            } finally {
            }
        }
    }

    private final OkHttpClient getAuthlessClient() {
        return (OkHttpClient) this.authlessClient.getValue();
    }

    public final Soundscape.AudioFile getPreferredAudioFile(Soundscape soundscape) {
        Object obj;
        Object obj2;
        List<Soundscape.AudioFile> audioFiles = soundscape.getAudioFiles();
        if (audioFiles != null) {
            Iterator<T> it = audioFiles.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (kotlin.jvm.internal.m.c(((Soundscape.AudioFile) obj2).getFileExtension(), "flac")) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            Soundscape.AudioFile audioFile = (Soundscape.AudioFile) obj2;
            if (audioFile != null) {
                return audioFile;
            }
            Iterator<T> it2 = audioFiles.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (kotlin.jvm.internal.m.c(((Soundscape.AudioFile) next).getFileExtension(), "m4a")) {
                    obj = next;
                    break;
                }
            }
            Soundscape.AudioFile audioFile2 = (Soundscape.AudioFile) obj;
            if (audioFile2 != null) {
                return audioFile2;
            }
        }
        return new Soundscape.AudioFile(soundscape.getMp3Url(), soundscape.getMp3Checksum(), "mp3");
    }

    private final File getSoundscapesCacheDir() {
        File file = new File(this.context.getFilesDir(), SOUNDSCAPES_DIR);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private final File tempFileFor(Soundscape soundscape) {
        return new File(getSoundscapesCacheDir(), defpackage.f.B(soundscape.getId(), "_temp"));
    }

    public final ir.i downloadSoundscape(Soundscape soundscape) {
        soundscape.getClass();
        m1 m1Var = new m1(new SoundscapeDownloader$downloadSoundscape$1(this, soundscape, null));
        mr.e eVar = r0.f9888a;
        return r.x(m1Var, mr.d.f23445b);
    }

    public final File getCachedFile(Soundscape soundscape) {
        soundscape.getClass();
        File cacheFileFor = cacheFileFor(soundscape, getPreferredAudioFile(soundscape));
        if (cacheFileFor.exists()) {
            return cacheFileFor;
        }
        return null;
    }

    public final boolean isCached(Soundscape soundscape) {
        soundscape.getClass();
        if (getCachedFile(soundscape) != null) {
            return true;
        }
        return false;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/elevenlabs/data/services/SoundscapeDownloader$Companion;", "", "<init>", "()V", "SOUNDSCAPES_DIR", "", "BUFFER_SIZE", "", "fileExtensionFromContentType", "contentType", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final String fileExtensionFromContentType(String contentType) {
            contentType.getClass();
            switch (contentType.hashCode()) {
                case 187090231:
                    if (!contentType.equals("audio/mp3")) {
                        return null;
                    }
                    return "mp3";
                case 187090232:
                    if (contentType.equals("audio/mp4")) {
                        return "m4a";
                    }
                    return null;
                case 187091926:
                    if (contentType.equals("audio/ogg")) {
                        return "ogg";
                    }
                    return null;
                case 1504619009:
                    if (contentType.equals("audio/flac")) {
                        return "flac";
                    }
                    return null;
                case 1504831518:
                    if (!contentType.equals("audio/mpeg")) {
                        return null;
                    }
                    return "mp3";
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
