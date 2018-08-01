package com.depu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestControllerTest {

	/** A锁 */
	private static String A = "A";

	/** B锁 */
	private static String B = "B";

	@RequestMapping("/test1")
	@ResponseBody
	public String defaultTest() {
		return "default test";
	}
	
	@RequestMapping("/test2")
	@ResponseBody
	public String test2() {

		System.out.println(Thread.currentThread().getName()+"!!!!!!!!!!!!!!!!!!!!!!!!!");

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (A) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (B) {
						System.out.println("thread1...");
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (B) {
					synchronized (A) {
						System.out.println("thread2...");
					}
				}
			}
		});

		t1.start();
		t2.start();

		return "test2";
	}
}
