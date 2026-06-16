package io.elevenlabs.data.extensions;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import defpackage.f;
import eo.k;
import ho.l;
import ho.p;
import hr.w;
import hr.x;
import io.elevenlabs.data.api.adapter.ApiError;
import io.elevenlabs.domain.ApiException;
import io.elevenlabs.domain.exceptions.ApiExceptionFactoryKt;
import io.elevenlabs.domain.model.FileDownloadState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Response;
import okhttp3.ResponseBody;
import qr.h;
import sn.z;
import tn.a0;
import tn.u;
import ur.g1;
import ur.h0;
import yn.e;
import yn.i;
import zs.p0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.extensions.FileDownloadExtensionKt$downloadFile$1", f = "FileDownloadExtension.kt", l = {31, 45, 77}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "Lio/elevenlabs/domain/model/FileDownloadState;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class FileDownloadExtensionKt$downloadFile$1 extends i implements p {
    final /* synthetic */ File $cacheFile;
    final /* synthetic */ l $call;
    final /* synthetic */ vr.c $json;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDownloadExtensionKt$downloadFile$1(File file, vr.c cVar, l lVar, wn.c<? super FileDownloadExtensionKt$downloadFile$1> cVar2) {
        super(2, cVar2);
        this.$cacheFile = file;
        this.$json = cVar;
        this.$call = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z invokeSuspend$lambda$0(kotlin.jvm.internal.z zVar, File file, File file2, Throwable th) {
        if (!zVar.f20568a) {
            file.delete();
            file2.delete();
        }
        return z.f31622a;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        FileDownloadExtensionKt$downloadFile$1 fileDownloadExtensionKt$downloadFile$1 = new FileDownloadExtensionKt$downloadFile$1(this.$cacheFile, this.$json, this.$call, cVar);
        fileDownloadExtensionKt$downloadFile$1.L$0 = obj;
        return fileDownloadExtensionKt$downloadFile$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((FileDownloadExtensionKt$downloadFile$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00c4, code lost:
    
        if (((hr.w) r2).f12593d.c(r0, r18) == r7) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0113 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x002b, B:9:0x01f9, B:16:0x0042, B:18:0x010b, B:20:0x0113, B:22:0x0117, B:23:0x011d, B:28:0x0152, B:31:0x0159, B:36:0x0165, B:35:0x015e, B:41:0x014c, B:43:0x0166, B:45:0x0172, B:55:0x01bd, B:74:0x020c, B:75:0x020f, B:76:0x0210, B:77:0x0217, B:101:0x00f5, B:47:0x0178, B:54:0x01ba, B:66:0x0206, B:67:0x0209, B:27:0x0126, B:71:0x020a), top: B:2:0x000f, inners: #1, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x002b, B:9:0x01f9, B:16:0x0042, B:18:0x010b, B:20:0x0113, B:22:0x0117, B:23:0x011d, B:28:0x0152, B:31:0x0159, B:36:0x0165, B:35:0x015e, B:41:0x014c, B:43:0x0166, B:45:0x0172, B:55:0x01bd, B:74:0x020c, B:75:0x020f, B:76:0x0210, B:77:0x0217, B:101:0x00f5, B:47:0x0178, B:54:0x01ba, B:66:0x0206, B:67:0x0209, B:27:0x0126, B:71:0x020a), top: B:2:0x000f, inners: #1, #4, #6 }] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.jvm.internal.z] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        File file;
        kotlin.jvm.internal.z zVar;
        Response response;
        String str;
        Object lVar;
        x xVar = (x) this.L$0;
        int i10 = this.label;
        Object obj2 = null;
        xn.a aVar = xn.a.f37986a;
        try {
        } catch (Exception e10) {
            ((w) xVar).m(e10);
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    zVar = (kotlin.jvm.internal.z) this.L$2;
                    File file2 = (File) this.L$1;
                    sn.a.g(obj);
                    file = file2;
                    invoke = obj;
                    p0 p0Var = (p0) invoke;
                    response = p0Var.f39809a;
                    if (response.F0) {
                        ResponseBody responseBody = p0Var.f39811c;
                        if (responseBody != null) {
                            str = responseBody.E();
                        } else {
                            str = null;
                        }
                        vr.c cVar = this.$json;
                        if (str == null) {
                            str = "";
                        }
                        try {
                            cVar.getClass();
                            ApiError apiError = (ApiError) cVar.b(str, ApiError.INSTANCE.serializer());
                            lVar = ApiExceptionFactoryKt.apiExceptionFor(apiError.getDetail().getStatus(), apiError.getDetail().getMessage());
                        } catch (Throwable th) {
                            lVar = new sn.l(th);
                        }
                        if (!(lVar instanceof sn.l)) {
                            obj2 = lVar;
                        }
                        ApiException apiException = (ApiException) obj2;
                        if (apiException != null) {
                            throw apiException;
                        }
                        throw new IOException("File download failed");
                    }
                    Map R = a0.R(response.f25428f);
                    ResponseBody responseBody2 = (ResponseBody) p0Var.f39810b;
                    if (responseBody2 != null) {
                        InputStream a10 = responseBody2.a();
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(this.$cacheFile);
                            try {
                                long f25671d = responseBody2.getF25671d();
                                byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
                                int read = a10.read(bArr);
                                long j4 = 0;
                                while (read >= 0) {
                                    fileOutputStream.write(bArr, 0, read);
                                    j4 += read;
                                    read = a10.read(bArr);
                                    ((w) xVar).d(new FileDownloadState.Downloading((int) ((100 * j4) / f25671d)));
                                    aVar = aVar;
                                }
                                xn.a aVar2 = aVar;
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                a10.close();
                                vr.c cVar2 = this.$json;
                                cVar2.getClass();
                                g1 g1Var = g1.f34588a;
                                k.n0(file, cVar2.d(new h0(g1Var, g1Var), R));
                                zVar.f20568a = true;
                                FileDownloadState.Finished finished = new FileDownloadState.Finished(this.$cacheFile, R);
                                this.L$0 = xVar;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.label = 3;
                                if (((w) xVar).f12593d.c(finished, this) == aVar2) {
                                    return aVar2;
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        throw new IOException("Response body is null");
                    }
                    ((w) xVar).m(e10);
                    return z.f31622a;
                }
            } else {
                sn.a.g(obj);
                ((w) xVar).m(null);
                return z.f31622a;
            }
        } else {
            sn.a.g(obj);
            final File file3 = new File(this.$cacheFile.getParentFile(), f.B(this.$cacheFile.getName(), ".headers"));
            final ?? obj3 = new Object();
            if (this.$cacheFile.exists() && !this.$cacheFile.isDirectory()) {
                boolean exists = file3.exists();
                u uVar = u.f33548a;
                if (exists) {
                    try {
                        vr.c cVar3 = this.$json;
                        String k02 = k.k0(file3);
                        cVar3.getClass();
                        g1 g1Var2 = g1.f34588a;
                        uVar = (Map) cVar3.b(k02, new h0(g1Var2, g1Var2));
                    } catch (h unused) {
                    }
                }
                obj3.f20568a = true;
                FileDownloadState.Finished finished2 = new FileDownloadState.Finished(this.$cacheFile, uVar);
                this.L$0 = xVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 1;
            } else {
                final File file4 = this.$cacheFile;
                l lVar2 = new l() { // from class: io.elevenlabs.data.extensions.a
                    @Override // ho.l
                    public final Object invoke(Object obj4) {
                        z invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = FileDownloadExtensionKt$downloadFile$1.invokeSuspend$lambda$0(kotlin.jvm.internal.z.this, file4, file3, (Throwable) obj4);
                        return invokeSuspend$lambda$0;
                    }
                };
                w wVar = (w) xVar;
                wVar.l(lVar2);
                if (this.$cacheFile.isDirectory()) {
                    k.h0(this.$cacheFile);
                }
                File parentFile = this.$cacheFile.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                l lVar3 = this.$call;
                this.L$0 = wVar;
                this.L$1 = file3;
                this.L$2 = obj3;
                this.label = 2;
                invoke = lVar3.invoke(this);
                if (invoke != aVar) {
                    file = file3;
                    zVar = obj3;
                    p0 p0Var2 = (p0) invoke;
                    response = p0Var2.f39809a;
                    if (response.F0) {
                    }
                    ((w) xVar).m(e10);
                    return z.f31622a;
                }
            }
            return aVar;
        }
        ((w) xVar).m(null);
        return z.f31622a;
    }
}
